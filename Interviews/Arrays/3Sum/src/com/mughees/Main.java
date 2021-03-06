package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static List<List<Integer>> threeSum(int[] num) {
        // sort to avoid duplicates
        Arrays.sort(num);

        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < num.length - 2; i++) {
            if (num[i] > 0) break;
            if (i == 0 || num[i] != num[i - 1]) {
                // two-pointer method
                int left = i + 1;
                int right = num.length - 1;
                int target = -num[i];

                while (left < right) {
                    if (num[left] + num[right] == target) {
                        result.add(Arrays.asList(num[i], num[left], num[right]));
                        while (left < right && num[left] == num[left + 1]) left++;
                        while (left < right && num[right] == num[right - 1]) right--;
                        left++;
                        right--;
                    } else if (num[left] + num[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
