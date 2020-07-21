package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(rob(new int[] {1,2,3,1}));
        System.out.println(rob(new int[] {2,7,9,3,1}));
    }

    public static int rob(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
