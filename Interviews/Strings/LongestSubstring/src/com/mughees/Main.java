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
}
