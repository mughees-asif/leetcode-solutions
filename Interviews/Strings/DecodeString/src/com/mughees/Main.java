package com.mughees;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public String decodeString(String s) {
        int index = 0;
        String result = "";
        Stack<Integer> count = new Stack<>();
        Stack<Character> ch = new Stack<>();

        while (index < s.length()) {

            // first condition: digit
            if (Character.isDigit(s.charAt(index))) {
                int counts = 0;
                while (Character.isDigit(s.charAt(index))) {
                    counts = 10 * counts + (s.charAt(index) - '0');
                    index += 1;
                }
                count.push(counts);
            }

            // second condition: open bracket ('[')
            else if (s.charAt(index) == '[') {
                
            }

            //third condition: close bracket (']')


            // fourth condition: character

        }
        return result;
    }
}
