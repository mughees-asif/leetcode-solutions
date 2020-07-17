package com.mughees;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Before Transposition:\t" + Arrays.deepToString(matrix));
        rotate(matrix);
        System.out.println("After Transposition:\t" + Arrays.deepToString(matrix));
    }

    public static void rotate(int[][] matrix) {
        if (matrix == null || matrix.length < 2) return;

        // transpose
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse
        int mid = length / 2;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < mid; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][length - j - 1];
                matrix[i][length - j - 1] = tmp;
            }
        }
    }
}