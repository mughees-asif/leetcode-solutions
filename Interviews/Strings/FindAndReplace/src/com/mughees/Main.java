package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(findReplaceString("abcd", new int[]{0, 2}, new String[]{"a", "cd"}, new String[]{"ee", "ffff"}));
    }

    public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        int stringLength = S.length();
        int[] match = new int[stringLength];
        Arrays.fill(match, -1);

        for (int i = 0; i < indexes.length; ++i) {
            int index = indexes[i];
            if (S.substring(index, index + sources[i].length()).equals(sources[i]))
                match[index] = i;
        }

        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < stringLength) {
            if (match[index] >= 0) {
                result.append(targets[match[index]]);
                index += sources[match[index]].length();
            } else {
                result.append(S.charAt(index++));
            }
        }
        return result.toString();
    }
}
