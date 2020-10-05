package com.mughees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] arr2 = {{1, 4}, {4, 5}};
        System.out.println(Arrays.deepToString(merge(arr)));
        System.out.println(Arrays.deepToString(merge(arr2)));
    }

    public static int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        for (int outer = 0; outer < intervals.length; outer++) {
            for (int inner = 1; inner < intervals[outer].length; inner++) {
                if (intervals[outer][inner] >= intervals[outer + 1][inner - 1]) {
                    list.add(merge1(intervals[outer], intervals[outer + 1]));
                } else {
                    return intervals;
                }
            }
        }
        return list.toArray(intervals);
    }

    static List<Integer> merge1(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0, j = b.length - 1; i < a.length; i++) {
            result.add(a[i]);
            result.add(b[j]);
        }
        return result;
    }
}
