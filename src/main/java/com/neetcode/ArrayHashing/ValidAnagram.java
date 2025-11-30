package com.neetcode.ArrayHashing;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        String sorted_s = sort(s);
        String sorted_t = sort(t);

        // Compare the sorted strings
        return sorted_s.equals(sorted_t);
    }

    private String sort(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        return new String(charArray);

    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";

        boolean result = validAnagram.isAnagram(s, t);
        System.out.println("Is \"" + s + "\" an anagram of \"" + t + "\"? " + result); // Output: true
    }
}
