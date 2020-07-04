package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(isAnagram("abcd", "dcba"));
        System.out.println(isAnagram2("anagram", "naagram"));
    }

    private static boolean isAnagram(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        String anagram = sb.reverse().toString();
        return t.equals(anagram);
    }

    private static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first); Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}
