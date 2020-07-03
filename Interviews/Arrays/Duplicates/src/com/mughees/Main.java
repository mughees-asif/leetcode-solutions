package com.mughees;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(containsDuplicates(new int[]{1, 1, 2, 4}));
    }

    static int removeDuplicates(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int value : nums) {
            hashSet.add(value);
        }
        return hashSet.size();
    }

    static boolean containsDuplicates(int[] nums) {
        boolean flag = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
