package com.leetcode.HashTable;

/* Given a positive integer k, you need to find the length of the smallest positive integer n such that n is divisible by k, and n only contains the digit 1.

Return the length of n. If there is no such n, return -1.

Note: n may not fit in a 64-bit signed integer.
*/

public class SmallestIntegerDivisibleByK {

    public int smallestRepunitDivByK(int k) {

        int remainder = 1;
        int count = 1;

        if(k==1) return 1;

        if(k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        while (remainder != 0) {
            count++;
            remainder = (remainder * 10 + 1) % k;
        }

        return count;
    }

    public static void main(String[] args) {
        SmallestIntegerDivisibleByK smallestIntegerDivisibleByK = new SmallestIntegerDivisibleByK();
        int k = 3;
        int result = smallestIntegerDivisibleByK.smallestRepunitDivByK(k);
        System.out.println(result); // Output: 1
    }
}
