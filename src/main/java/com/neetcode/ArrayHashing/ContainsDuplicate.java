package com.neetcode.ArrayHashing;

public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {

        boolean flag = false;
        int check;
        for(int i=0;i<nums.length;i++) {
            check = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == check) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 5, 1};
        boolean result = containsDuplicate.hasDuplicate(nums);
        System.out.println("Contains Duplicate: " + result); // Output: true
    }
}
