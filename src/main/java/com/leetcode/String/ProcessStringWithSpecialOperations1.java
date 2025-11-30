package com.leetcode.String;

/*
You are given a string s consisting of lowercase English letters and the special characters: *, #, and %.

Build a new string result by processing s according to the following rules from left to right:

    If the letter is a lowercase English letter append it to result.
    A '*' removes the last character from result, if it exists.
    A '#' duplicates the current result and appends it to itself.
    A '%' reverses the current result.

Return the final string result after processing all characters in s.

Note: Please do not copy the description during the contest to maintain the integrity of your submissions.
*/

public class ProcessStringWithSpecialOperations1 {

    public String processStr(String s) {

        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                result.append(c);
            }
            else if(c == '*') {
                if(result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else if (c == '#') {
                result.append(result);
            } else if (c == '%') {
                // Reverse the current result
                result.reverse();
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ProcessStringWithSpecialOperations1 processor = new ProcessStringWithSpecialOperations1();
        String input = "a#b%*";
        String result = processor.processStr(input);
        System.out.println("Processed String: " + result);
    }
}
