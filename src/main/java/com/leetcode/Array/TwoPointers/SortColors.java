package com.leetcode.Array.TwoPointers;

public class SortColors {

    public void sortColors(int[] nums) {
        int n = nums.length;

        for (int i = 0;i<n-1;i++) {
            for (int j = 0; j<n-1-i;j++) {
                if(nums[j] < nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        int l = 0;
        int r = nums.length-1;

        while (l < r) {
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] nums = {2,0,2,1,1,0,0,2,1};
        sortColors.sortColors(nums);
        for (int i = 0; i < nums.length;i++) {
            System.out.print(nums[i]+ " ");
        }
    }

}
