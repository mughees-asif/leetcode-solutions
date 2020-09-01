package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public static int[] intersect(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Object> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[list.size()];
        for (i = 0; i < list.size(); i++) {
            result[i] = (int) list.get(i);
        }
        return result;
    }
}
