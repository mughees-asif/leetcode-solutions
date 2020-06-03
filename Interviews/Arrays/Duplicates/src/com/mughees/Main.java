package com.mughees;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int value : nums) {
            hashSet.add(value);
        }
        return hashSet.size();
    }
}
