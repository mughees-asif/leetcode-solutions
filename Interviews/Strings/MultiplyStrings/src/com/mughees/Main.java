package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiply("3", "2"));
    }

    public static String multiply(String num1, String num2) {
        int s1 = converter(num1);
        int s2 = converter(num2);
        return String.valueOf(s1 * s2);
    }

    private static int converter(String num1) {
        int num = 0;
        int i = 0;
        while( i < num1.length()) {
            num *= 10;
            num += num1.charAt(i++) - '0'; // Minus the ASCII code of '0' to get the value of the charAt(i++).
        }
        return num;
    }





}
