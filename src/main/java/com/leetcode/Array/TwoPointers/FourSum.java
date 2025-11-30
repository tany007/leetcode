package com.leetcode.Array.TwoPointers;

import java.util.*;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        int mod = 1000000007;
        List<List<Integer>> output = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for (int i=0;i<nums.length-3;i++) {
            for (int j=i+1;j<nums.length-2;j++) {
                int left = j+1;
                int right = nums.length-1;

                while(left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        set.add(Arrays.asList(nums[i],nums[j],nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        output.addAll(set);
        return output;
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        List<List<Integer>> result = fourSum.fourSum(nums, target);
        System.out.println(result);
    }
}
