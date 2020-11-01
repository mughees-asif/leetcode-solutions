package com.mughees;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public String decodeString(String s) {
        int index = 0;
        String result = "";
        Stack<Integer> digits = new Stack<>();
        Stack<String> characters = new Stack<>();

        while (index < s.length()) {

            // first condition: digit
            if (Character.isDigit(s.charAt(index))) {
                int counts = 0;
                while (Character.isDigit(s.charAt(index))) {
                    counts = 10 * counts + (s.charAt(index) - '0');
                    index++;
                }
                digits.push(counts);
            }

            // second condition: open bracket ('[')
            else if (s.charAt(index) == '[') {
                characters.push(result);
                result = "";
                index++;
            }

            //third condition: close bracket (']')
            else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(characters.pop());
                int counts = digits.pop();
                for (int i = 0; i < counts; i++) {
                    temp.append(result);
                }
                result = temp.toString();
                index++;
            }

            // fourth condition: character
            else {
                result += s.charAt(index);
                index++;
            }

        }
        return result;
    }
}
