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
        Stack<String> ch = new Stack<>();

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
                ch.push(result);
                result = "";
                index += 1;
            }

            //third condition: close bracket (']')
            else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(ch.pop());
                int counts = count.pop();
                for (int i = 0; i < counts; i++) {
                    temp.append(result);
                }
                result = temp.toString();
                index += 1;
            }

            // fourth condition: character

        }
        return result;
    }
}
