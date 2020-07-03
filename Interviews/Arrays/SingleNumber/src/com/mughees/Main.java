package com.mughees;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 2, 3};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
