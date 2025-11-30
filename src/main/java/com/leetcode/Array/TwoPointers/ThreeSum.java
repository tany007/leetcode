package com.leetcode.Array.TwoPointers;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++) {
            int left = i+1;
            int right = nums.length-1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        output.addAll(set);
        return output;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        System.out.println(result);
    }
}
