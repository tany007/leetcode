package com.leetcode.weeklycontest459;

/*
You are given a positive integer n. Determine whether n is divisible by the sum of the following two values:

    The digit sum of n (the sum of its digits).

    The digit product of n (the product of its digits).

Return true if n is divisible by this sum; otherwise, return false.



Example 1:

Input: n = 99

Output: true

Explanation:

Since 99 is divisible by the sum (9 + 9 = 18) plus product (9 * 9 = 81) of its digits (total 99), the output is true.

Note: Please do not copy the description during the contest to maintain the integrity of your submissions.

 */
public class CheckDivisibilityByDigitSumAndProduct {

    public boolean checkDivisibility(int no) {
        int n = no;
        int sum = 0;
        int product = 1;
        int summation ;
        while(n>0){
            int digit = n % 10;
            sum +=  digit;
            product *= digit;
            n /= 10;
        }

        summation = sum + product;
        if (summation == 0) {
            return false; // Avoid division by zero
        }
        return no % summation == 0;
    }

    public static void main(String[] args) {
        CheckDivisibilityByDigitSumAndProduct checker = new CheckDivisibilityByDigitSumAndProduct();
        int n = 23; // Example input
        boolean result = checker.checkDivisibility(n);
        System.out.println("Is " + n + " divisible by the sum of its digit sum and product? " + result);
    }
}
