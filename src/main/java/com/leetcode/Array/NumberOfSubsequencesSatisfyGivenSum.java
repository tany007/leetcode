package com.leetcode.Array;

/*
You are given an array of integers nums and an integer target.
Return the number of non-empty subsequences of nums such that
the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 109 + 7.
*/

import java.util.Arrays;

public class NumberOfSubsequencesSatisfyGivenSum {

    public int numSubseq(int[] nums, int target) {

        Arrays.sort(nums);
        int mod = 1000000007;
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int result = 0;

        // Precompute powers of 2 modulo mod for efficiency
        int[] power = new int[n + 1];
        power[0] = 1;
        for (int i = 1; i <= n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }


        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                // Add all possible subsequences in nums[left..right]
                // where nums[left] is min and nums[right] is max
                result = (result + power[right - left]) % mod;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NumberOfSubsequencesSatisfyGivenSum numberOfSubsequencesSatisfyGivenSum = new NumberOfSubsequencesSatisfyGivenSum();
        int[] nums = {2,3,3,4,6,7};
        int target = 12;
        int result = numberOfSubsequencesSatisfyGivenSum.numSubseq(nums, target);
        System.out.println(result);
    }

}
