package com.mughees;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(new String("abcabcbb")));
        System.out.println(lengthOfLongestSubstring(new String("bbbbb")));
        System.out.println(lengthOfLongestSubstring(new String("pwwkew")));
    }

    public static int lengthOfLongestSubstring(String s) {
        s = s.replaceAll("\\W", "").toLowerCase();

        HashSet<Character> hashSet = new HashSet<>();
        for(char i = 0; i < s.length();i++) {
            hashSet.add(s.charAt(i));
        }
        System.out.println(hashSet);

        return hashSet.size();
    }
}
