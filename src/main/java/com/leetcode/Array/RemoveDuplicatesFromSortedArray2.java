package com.leetcode.Array;

public class RemoveDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {

        for(int i=0;i<nums.length-2;i++) {
            for(int j=i+1; j<nums.length-1;j++) {
                int k = nums[j+1];
                if(nums[i] == nums[j] && nums[j] == nums[k]) {
                    nums[k] = -1;
                }
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray2 removeDuplicatesFromSortedArray2 = new RemoveDuplicatesFromSortedArray2();
        removeDuplicatesFromSortedArray2.removeDuplicates(new int[] {1,1,1,2,2,3});
    }

}
