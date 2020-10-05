package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] arr2 = {{1, 4}, {4, 5}};
        System.out.println(Arrays.deepToString(merge(arr)));
        System.out.println(Arrays.deepToString(merge(arr2)));
    }

    private static class IntervalComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[0], b[0]);
        }
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new IntervalComparator());
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
