package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if(result.containsKey(value)) {
                return new int[] {result.get(value), i};
            }
            result.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
