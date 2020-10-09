package com.mughees;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            int length_1 = expandFromMiddle(s, i, i);
            int length_2 = expandFromMiddle(s, i, i + 1);
            int length = Math.max(length_1, length_2);

            if(length > right - left) {
                left = i - ((length - 1) / 2);
                right = i + (length / 2);
            }

        }
        return s.substring(left, right + 1);
    }

    public static int expandFromMiddle(String s, int start, int end) {
        if (s == null || start > end) return 0;

        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}
