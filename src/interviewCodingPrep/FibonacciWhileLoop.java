package interviewCodingPrep;

public class FibonacciWhileLoop {
    public void fibonacciFinder(){
        int n = 10; // Fibonacci numbers to print
        int t1=0, t2=1;
        int count =1; // To keep track how many numbers have been printed

        // Print the first two fibonacci numbers
        System.out.print("First " + n + " fibonacci numbers are " + t1 +", " + t2 );

        while(count<n-2){
            int sum = t1 + t2;
            System.out.print(", " + sum);
            t1=t2;
            t2=sum;
            count++;
        }
    }

    public static void main(String[]args){
        FibonacciWhileLoop fibonacciNumber = new FibonacciWhileLoop();

        fibonacciNumber.fibonacciFinder();
    }
}
