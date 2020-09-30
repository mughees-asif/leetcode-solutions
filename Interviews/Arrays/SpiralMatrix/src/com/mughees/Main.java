package com.mughees;

import org.w3c.dom.css.CSSImportRule;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] test = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(test));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        List<Integer> backwardsRow = new ArrayList<>();
//        for(int i = matrix[2].length - 1; i > 0; i--) {
//            result.add(result.get(matrix[2][]));
//        }
        int length = matrix.length;
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row == 0) {
                    result.add(matrix[row][column]);
                } else if (row == 1) {
                    result.add(matrix[row][matrix.length - 1]);
                    result.add(length - 2, matrix[row][length - 2]);
                    result.add(length - 1, matrix[row][length - 1]);
                } else {
                    result.add()
                }

            }
        }


        return result;
    }
}
