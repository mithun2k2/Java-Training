package com.qaScript;

import java.util.HashMap;

/**
 *
 *  * Count the number of Duplicates
 * Write a function that will return the count of distinct case-insensitive alphabetic characters and
 * numeric digits that occur more than once in the input string. The input string can be assumed to
 * contain only alphabets (both uppercase and lowercase) and numeric digits.
 * Example
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 * StringsFundamentals
 *  */

public class DuplicateCharacterCounter {
    public static int countDuplicates(String inputString){
        inputString = inputString.toLowerCase();

        //HashMap to count occarances of each character
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char ch: inputString.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
            }
        }
        // Count distinct characters that have more than one occarances
        int duplicateCount = 0;
        for(int count: charCount.values()){
            if(count>1){
                duplicateCount++;
            }
        }
        return duplicateCount;
    }

    public static void main(String[]args){
        System.out.println(countDuplicates("abcde"));
        System.out.println(countDuplicates("aabbcde"));
        System.out.println(countDuplicates("aaBcDe"));
        System.out.println(countDuplicates("indivisibility"));
        System.out.println(countDuplicates("Indivisibilities"));
        System.out.println(countDuplicates("aA11"));
        System.out.println(countDuplicates("ABBA"));
    }

}
