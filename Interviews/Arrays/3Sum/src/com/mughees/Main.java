package com.mughees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> overallResult = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length - 2; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[k]);
                    }
                }
            }
            overallResult.add(result);
        }
        return overallResult;
    }
}
