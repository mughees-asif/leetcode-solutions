package com.mughees;

import java.util.Arrays;

public class Solution {

    private static int[] removeInvalidParentheses(int[] arr) {
        int N = arr.length;
        int[] productBefore = new int[N];
        int[] productAfter = new int[N];
        int[] output = new int[N];
        int i, p =1;

        for(i = 0; i < N; i++) {
            productBefore[i] = p;
            p *= arr[i];
        }

        p = 1;
        for(i = N - 1; i >= 0; i--) {
            productAfter[i] = p;
            p *= arr[i];
        }

        for(i = 0; i < N; i++) {
            output[i] = productAfter[i] * productBefore[i];
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeInvalidParentheses(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(removeInvalidParentheses(new int[]{1, 2, 3, 2, 3})));

    }
}
