package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        System.arraycopy(nums1, 0, result, 0, m);
        System.arraycopy(nums2, 0, result, m, m);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1, p = m - 1, j = n - 1; j >= 0; i--) {
            nums1[i] = (p < 0 || nums2[j] >= nums1[p]) ? nums2[j--] : nums1[p--];
        }
    }
}
