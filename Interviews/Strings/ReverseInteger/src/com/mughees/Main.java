package com.mughees;

public class Main {

    public static void main(String[] args) {
//        reverseInteger(1234);
        System.out.println(reverseInteger2(1234));
    }

    static void reverseInteger(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        System.out.println(arr);
    }

    static int reverseInteger2(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return Integer.parseInt(new String(arr));
    }
}
