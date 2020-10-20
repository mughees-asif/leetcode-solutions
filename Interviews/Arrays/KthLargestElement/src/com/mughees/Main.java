package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
    }
    public static int findKthLargest(int[] nums, int k) {
        int result = 0;
        Arrays.sort(nums);
        // reverse sorted array - descending
        for(int i = nums.length - 1, j = 0; i > 0; i--, j++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        System.out.println(Arrays.toString(nums));


        return result;
    }

}
