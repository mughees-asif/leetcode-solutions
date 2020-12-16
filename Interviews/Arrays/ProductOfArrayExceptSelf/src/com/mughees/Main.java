package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        // products of all elements
        int[] productBelow = new int[N];
        int p = 1;
        for (int i = 0; i < N; ++i) {
            productBelow[i] = p;
            p *= nums[i];
        }
        System.out.println(Arrays.toString(productBelow));

        int[] productAbove = new int[N];
        p = 1;
        for (int i = N - 1; i >= 0; --i) {
            productAbove[i] = p;
            p *= nums[i];
        }
        System.out.println(Arrays.toString(productAbove));
        int[] products = new int[N];
        for (int i = 0; i < N; ++i) {
            products[i] = productBelow[i] * productAbove[i];
        }
        return products;
    }
}
