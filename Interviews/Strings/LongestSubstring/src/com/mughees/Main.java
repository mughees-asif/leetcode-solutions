package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(new String("abcabcbb")));
        System.out.println(lengthOfLongestSubstring(new String("bbbbb")));
        System.out.println(lengthOfLongestSubstring(new String("pwwkew")));

        
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0;
        int leftPointer = 0;
        int rightPointer = 0;

        while (leftPointer < length && rightPointer < length) {
            if (!set.contains(s.charAt(rightPointer))) {
                set.add(s.charAt(rightPointer++));
                ans = Math.max(ans, rightPointer - leftPointer);
            } else {
                set.remove(s.charAt(leftPointer++));
            }
        }
        return ans;
    }

    static List<List<Integer>> threeSum(int[] input, int target) {
        int length = input.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if(input[i] + input[j] + input[k] == target) {
                        result.add(Arrays.asList(input[i], input[j], input[k]));
                    }
                }
            }
        }
        return result;
    }
}
