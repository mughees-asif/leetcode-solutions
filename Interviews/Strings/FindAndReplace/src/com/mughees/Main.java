package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(findReplaceString("abcd", new int[]{0, 2}, new String[]{"a", "cd"}, new String[]{"ee", "ffff"}));
    }

    public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        int stringPointer = 0;
        int indexPointer = 0;
        int sourcesPointer = 0;
        int targetsPointer = 0;

        StringBuilder result = new StringBuilder();
        char[] stringArray = S.toCharArray();

        for (int i = 1; i < indexes.length; i++) {

            if (S.substring(0, indexes[i]).equals(sources[i])) {
                result.append(targets[i]);
                System.out.println(result);
            }


        }


        return result.toString();
    }
}
