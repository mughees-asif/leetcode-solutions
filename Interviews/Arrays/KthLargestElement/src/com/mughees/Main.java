package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    public static int findKthLargest(int[] nums, int k) {
        int result = 0;
        int length = nums.length;
        Arrays.sort(nums);
        // reverse sorted array - descending
        for (int i = 0; i < length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[length - i - 1];
            nums[length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(nums));


        return result;
    }


}
