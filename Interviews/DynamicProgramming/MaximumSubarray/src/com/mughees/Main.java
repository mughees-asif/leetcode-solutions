package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    // using Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int num : nums) {
            maxEndingHere = maxEndingHere + num;
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }
}
