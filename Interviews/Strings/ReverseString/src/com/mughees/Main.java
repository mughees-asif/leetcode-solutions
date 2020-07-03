package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.print(reverseString(new char[] {'h','e','l','l','o'}));
    }

    private static char[] reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
        return s;
    }
}
