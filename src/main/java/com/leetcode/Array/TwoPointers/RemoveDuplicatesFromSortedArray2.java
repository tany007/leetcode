package com.leetcode.Array.TwoPointers;

public class RemoveDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return 1;
        }

        int counter = 0;
        int pointer = 0;

        int n = nums.length;
        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i-1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter <= 2) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray2 removeDuplicatesFromSortedArray2 = new RemoveDuplicatesFromSortedArray2();
        int[] nums = {1,1,1,2,2,3};
        int result = removeDuplicatesFromSortedArray2.removeDuplicates(nums);
        System.out.println(result);
    }
}
