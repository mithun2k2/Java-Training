package interviewCodingPrep;

/*
 * Sudoku Background
Sudoku is a game played on a 9x9 grid. The goal of the game is to fill all cells of the grid with digits from 1 to 9,
* so that each column, each row, and each of the nine 3x3 sub-grids (also known as blocks) contain all of the digits from 1 to 9.
(More info at: http://en.wikipedia.org/wiki/Sudoku)

Sudoku Solution Validator
Write a function validSolution/ValidateSolution/valid_solution() that accepts a 2D array representing a Sudoku board,
and returns true if it is a valid solution, or false otherwise.
The cells of the sudoku board may also contain 0's, which will represent empty cells.
Boards containing one or more zeroes are considered to be invalid solutions.

The board is always 9 cells by 9 cells, and every cell only contains integers from 0 to 9.

Examples
validSolution([
  [5, 3, 4, 6, 7, 8, 9, 1, 2],
  [6, 7, 2, 1, 9, 5, 3, 4, 8],
  [1, 9, 8, 3, 4, 2, 5, 6, 7],
  [8, 5, 9, 7, 6, 1, 4, 2, 3],
  [4, 2, 6, 8, 5, 3, 7, 9, 1],
  [7, 1, 3, 9, 2, 4, 8, 5, 6],
  [9, 6, 1, 5, 3, 7, 2, 8, 4],
  [2, 8, 7, 4, 1, 9, 6, 3, 5],
  [3, 4, 5, 2, 8, 6, 1, 7, 9]
]); // => true
validSolution([
  [5, 3, 4, 6, 7, 8, 9, 1, 2],
  [6, 7, 2, 1, 9, 0, 3, 4, 8],
  [1, 0, 0, 3, 4, 2, 5, 6, 0],
  [8, 5, 9, 7, 6, 1, 0, 2, 0],
  [4, 2, 6, 8, 5, 3, 7, 9, 1],
  [7, 1, 3, 9, 2, 4, 8, 5, 6],
  [9, 0, 1, 5, 3, 7, 2, 1, 4],
  [2, 8, 7, 4, 1, 9, 6, 3, 5],
  [3, 0, 0, 4, 8, 1, 1, 7, 9]
]); // => false
 */
public class SudokuValidator {
    public static boolean validSolution(int[][]board){

        // Check for presence of zero
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]==0){
                    return false; // Found an empty cell
                }
            }
        }
        // Verify rows and columns
        for(int i= 0; i<9; i++){
            if(!isValidGroup(board[i])||!isValidGroup(getColumn(board,i))){
                return false; // Invalid rows or columns
            }
        }

        // Verify 3 X 3 subgrids

        for(int row = 0; row<9; row+=3 ){
            for(int col=0; col<9; col+=3){
                if(!isValidGroup(getSubGrid(board, row, col))){
                    return false; // Invalid subgrid
                }
            }
        }
        return true; // All checks passed
    }

    private static boolean isValidGroup(int[]group){
        boolean[] seen = new boolean[10]; // index 0 is unused
        for(int num:group){
            if(num<1 || num>9 || seen[num]){
                return false; // invalid number or duplicate found
            }
            seen[num]= true; // Mark this number as seen
        }

        return true; // All numbers are valid and unique

    }

    private static int[] getColumn(int[][] board, int col){
        int[] column = new int[9];
        for(int i=0; i<9; i++){
            column[i] =board[i][col];
        }
        return column;
    }

    private static int[] getSubGrid(int[][] board, int startRow, int startCol){
        int[] subGrid = new int[9];
        int index =0;
        for(int row = startRow; row<(startRow+3); row++){
            for(int col=startCol; col<(startCol+3); col++){
                subGrid[index++] = board[row][col];
            }
        }
        return subGrid;
    }

    public static void main(String[] args) {
        int[][] validBoard = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[][] invalidBoard = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 0, 3, 4, 8},
                {1, 0, 0, 3, 4, 2, 5, 6, 0},
                {8, 5, 9, 7, 6, 1, 0, 2, 0},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 0, 1, 5, 3, 7, 2, 1, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 0, 0, 4, 8, 1, 1, 7, 9}
        };
        System.out.println(validSolution(validBoard));
        System.out.println(validSolution(invalidBoard));
    }
}