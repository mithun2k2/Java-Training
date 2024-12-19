package interviewCodingPrep;

/**
 * Implement a method which performs basic string compression by counting sequences of repeating characters.
 * Given “AABBBCCCD” it should return “A2B3C3D1”. Sample Input:
 * AABA ABCDE KKKKK
 * Sample Output:
 * A2B1A1 A1B1C1D1E1 K5
 */

public class StringCompression {
    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();

        int count = 1; // Initialize the count of the current character
        for (int i = 0; i < input.length(); i++) {
            // If we are not at the last character and current character is the
            // same as the next character
            if ((i + 1) < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                // Else the character is different from the next one and we reach the end
            } else {
                compressed.append(input.charAt(i));
                compressed.append(count);

                count=1; // Reset the count
            }
        }
        return compressed.toString();
    }
        public static void main(String[] args){
            String[] inputs = {
                    "AABBCCEE",
                    "AbCDDEE",
                    "BBGRTHHIIDD",
                    "AWSSEEQRTFFK"
            };
            for(String input: inputs){
                String compressedOutput = compressString(input);
                System.out.println(compressedOutput);
            }
        }
    }
