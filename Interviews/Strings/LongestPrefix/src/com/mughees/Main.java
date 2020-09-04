package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr));
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        Arrays.sort(strs);
        String firstElement = strs[0];
        String lastElement = strs[strs.length - 1];
        // find the minimum length of prefix in the range (first to the last string element in array)
        int minimumLengthOfPrefix = Math.min(firstElement.length(), lastElement.length());

        int i = 0;
        while (i < minimumLengthOfPrefix && firstElement.charAt(i) == lastElement.charAt(i)) {
            i++;
        }
        return strs[0].substring(0, i);
    }
}
