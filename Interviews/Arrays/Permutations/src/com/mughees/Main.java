package com.mughees;

import java.util.*;

public class Main {

    // change the position of every element to the first place,
    // and permute the rest, except the first one.

    private static List<List<Integer>> result;

    private static void permuteHelper(int[] num, int index) {
        if (index == num.length) {
            result.add(getOriginal(num));
            return;
        }
        for (int j = index; j < num.length; j++) {
            //Arrays.sort(num, idx, num.length);
            swap(num, index, j);
            permuteHelper(num, index + 1);
            swap(num, index, j);
        }
    }

    private static void swap(int[] num, int i, int j) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

    private static List<Integer> getOriginal(int[] num) {
        List<Integer> tmp = new ArrayList<>();
        for (int value : num) {
            tmp.add(value);
        }
        return tmp;
    }

    private static List<List<Integer>> permute(int[] num) {
        result = new ArrayList<>();
        permuteHelper(num, 0);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(permute(arr));
    }
}
