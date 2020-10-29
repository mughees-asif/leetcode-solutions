package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiply("3", "2"));
    }

    public static String multiply(String num1, String num2) {
        int s1 = Integer.parseInt(num1);
        int s2 = Integer.parseInt(num2);
        int product = s1 * s2;
        return String.valueOf(product);
    }



//        while( i < str.length()) {
//        num *= 10;
//        num += str.charAt(i++) - '0'; // Minus the ASCII code of '0' to get the value of the charAt(i++).
//    }
}
