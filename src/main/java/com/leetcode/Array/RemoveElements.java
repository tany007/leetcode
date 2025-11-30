package com.leetcode.Array;


public class RemoveElements {

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1 && nums[0]!=val) {
            return nums[0];
        }
        for(int fast=0;fast<nums.length;fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        RemoveElements removeElements = new RemoveElements();
        int[] nums = {3,3};
        int val = 5;
        int result = removeElements.removeElement(nums, val);
        System.out.println(result); // Output: 2
    }
}
