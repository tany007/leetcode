package com.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleByFive {

    public List<Boolean> prefixesDivBy5(int[] nums) {

        List<Boolean> output = new ArrayList<>();

        int remainder = 0;

        for(int i=0;i<nums.length;i++) {
            remainder = (remainder * 2 + nums[i])%5;
            output.add(remainder == 0);
        }

        return output;
    }

    public static void main(String[] args) {
        BinaryPrefixDivisibleByFive binaryPrefixDivisibleByFive = new BinaryPrefixDivisibleByFive();
        int[] nums = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        List<Boolean> result = binaryPrefixDivisibleByFive.prefixesDivBy5(nums);
        System.out.println(result);
    }
}
