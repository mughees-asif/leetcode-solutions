package com.mughees;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
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
        LinkedHashSet set = new LinkedHashSet<>();
        for(int value : nums) {
            set.add(value);
        }

        System.out.println(set);
        for(Object value: set) {
            if((int) value == k) {
                result = (int) value;
            }
        }


        return result;
    }


}
