package com.leetcode.Array.TwoPointers;

public class FindTheIndexOfTheFirstOccurrenceInaString {

    public int strStr(String haystack, String needle) {

        int found = -1;

        if (needle.isEmpty()) {
            return 0;
        }

        if (haystack.isEmpty()) {
            return -1;
        }

        if(haystack.length() < needle.length()) {
            return -1;
        }

        for(int i=0;i<haystack.length()-needle.length()+1;i++) {
            for(int j=0;j<needle.length();j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length()-1){
                    found = i;
                    return found;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInaString findTheIndexOfTheFirstOccurrenceInaString = new FindTheIndexOfTheFirstOccurrenceInaString();

        System.out.println(findTheIndexOfTheFirstOccurrenceInaString.strStr("abcdefgh", "abxxxfgh"));
    }
}
