package com.mughees;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a##c", "a#c#"));
    }

    public static boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public static String build(String S) {
        Stack<Character> ans = new Stack<>();
        for (char c: S.toCharArray()) {
            if (c != '#') {
                ans.push(c);
            } else if (!ans.empty()) {
                ans.pop();
            }
        }
        return String.valueOf(ans);
    }
}
