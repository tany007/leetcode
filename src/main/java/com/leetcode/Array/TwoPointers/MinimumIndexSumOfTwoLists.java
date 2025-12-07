package com.leetcode.Array.TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> map = new HashMap<>();

        for (int i=0;i<list1.length;i++) {
            map.put(list1[i],i);
        }

        int minIndexSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int j=0;j<list2.length;j++) {
            if (map.containsKey(list2[j])) {
                int indexSum = map.get(list2[j]) + j;
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear();
                    result.add(list2[j]);
                } else if (indexSum == minIndexSum) {
                    result.add(list2[j]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        MinimumIndexSumOfTwoLists minimumIndexSumOfTwoLists = new MinimumIndexSumOfTwoLists();
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result = minimumIndexSumOfTwoLists.findRestaurant(list1, list2);
        for (String restaurant : result) {
            System.out.println(restaurant);
        }
    }


}
