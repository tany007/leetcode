package com.leetcode.Array.TwoPointers;

public class NextPermutation {

    public void nextPermutation(int[] nums) {

        int breakpoint = -1;
        int correspondingsmallest = 0;

        for (int i = nums.length-2; i >= 0; i--){

            if (nums[i] < nums[i+1]) {
                breakpoint = i;
                break;
            }
        }
        if (breakpoint != -1) {
            for (int j = nums.length - 1; j > 0; j--) {

                if (nums[j] > nums[breakpoint]) {
                    correspondingsmallest = j;
                    break;
                }
            }

            int temp = nums[breakpoint];
            nums[breakpoint] = nums[correspondingsmallest];
            nums[correspondingsmallest] = temp;
        }

        int left =  breakpoint + 1;
        int right = nums.length - 1;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        int [] arr = new int[] {1,2,3};
        nextPermutation.nextPermutation(arr);
        for (int i = 0; i < arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
