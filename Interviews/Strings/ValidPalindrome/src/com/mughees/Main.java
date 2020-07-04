package com.mughees;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", "").toLowerCase(); // remove all non-alphanumeric characters
        s = s.replaceAll("_", ""); // remove underscores
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String palindrome = "";
        while (!stack.isEmpty()) {
            palindrome = palindrome + stack.pop();
        }
        return s.equals(palindrome);
    }
}
