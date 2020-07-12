package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {3,2,0}));
        System.out.println(missingNumber(new int[] {3,0,1}));
        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int[] tempArr = new int[nums.length + 1];
        for(int i = nums[0]; i < tempArr.length; i++) {
            tempArr[i] = i;
        }
        return Arrays.mismatch(tempArr, nums);
    }
}
