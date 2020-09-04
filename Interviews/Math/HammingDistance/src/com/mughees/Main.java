package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(hammingDistance(93, 73));
    }

    static int hammingDistance(int x, int y) {
        int XOR = x ^ y;
        int setBits = 0;
        while (XOR > 0) {
            setBits += XOR & 1;
            XOR >>= 1;
        }
        return setBits;
    }
}
