package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] productA = new int[length];
        int sum = 1;
        for (int i = 0; i < length; ++i) {
            productA[i] = sum;
            sum *= nums[i];
        }

        int[] productB = new int[length];
        sum = 1;
        for (int i = length - 1; i >= 0; --i) {
            productB[i] = sum;
            sum *= nums[i];
        }

        int[] products = new int[length];
        for (int i = 0; i < length; ++i) {
            products[i] = productA[i] * productB[i];
        }
        return products;
    }
}
