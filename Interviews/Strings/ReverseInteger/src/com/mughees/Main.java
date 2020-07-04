package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverse(-1234));
        System.out.println(reverse(1534236469));
    }

    private static int reverse(int num) {
        int result;
        char[] arr;
        try {
            if (num > 0) {     // positive numbers
                arr = String.valueOf(num).toCharArray();
                reverseInt(arr);
                result = Integer.parseInt(new String(arr));
                return result;
            } else {      // negative numbers
                num *= -1;
                arr = String.valueOf(num).toCharArray();
                reverseInt(arr);
                result = Integer.parseInt(new String(arr));
                return -result;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    private static void reverseInt(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
