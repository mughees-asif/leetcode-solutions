package com.mughees;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2));
    }

    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (s.indexOf(arr[i]) == s.lastIndexOf(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}
