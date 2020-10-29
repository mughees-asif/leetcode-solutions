package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiply("3", "2"));
    }

    public static String multiply(String num1, String num2) {
        int length_1 = num1.length(), length_2 = num2.length(); // lengths of numbers to be multiplied
        int[] resultArray = new int[length_1 + length_2]; // array to store the result

        for(int i = length_1 - 1; i >= 0; i--) { // iterate over first number
            for(int j = length_2 - 1; j >= 0; j--) { // iterate over second number
                int multiplication = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); // multiply both digits
                int sum = resultArray[i + j + 1] + multiplication; // saves space by doing addition in the same array
                resultArray[i + j] += sum / 10; // the number to be carried over is put in the position right before
                resultArray[i + j + 1] += sum % 10; // get the last digit
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int result : resultArray) {
            if(sb.length() != 0 || result != 0) { // check to eliminate leading zeros
                sb.append(result);
            }
        }
        return (sb.length() == 0) ? "0" : sb.toString();
    }
}