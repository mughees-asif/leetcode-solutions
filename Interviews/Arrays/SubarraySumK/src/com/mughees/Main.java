package com.mughees;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(subarraySum(new int[]{1, 2, 1, 2, 1}, 3));
        System.out.println(subarraySum(new int[]{1, 4, 20, 3, 10, 5}, 33));
    }

    static int subarraySum(int[] nums, int k) {
        int counter = 0;
        int total_sum = 0;

        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int num : nums) {
            total_sum += num;
            if (map.containsKey(total_sum - k))
                counter += map.get(total_sum - k);
            map.put(total_sum, map.getOrDefault(total_sum, 0) + 1);
        }
        return counter;
    }
}
