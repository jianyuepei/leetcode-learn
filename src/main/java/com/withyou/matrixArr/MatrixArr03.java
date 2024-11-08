package com.withyou.matrixArr;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author withyou
 * @desc
 * @create 2024/11/7 19:45
 */
public class MatrixArr03 {

    @Test
    public void test() {
//        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat = {{1, 2}, {3, 4}};
        int[] order = findDiagonalOrder(mat);
        System.out.println("order = " + Arrays.toString(order));
    }

    // ****************************************
    // 这个题本身并不复杂，使用模拟思路即可
    // ****************************************

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length, row = 0, col = 0;
        boolean up = true;
        int[] res = new int[m * n];
        int idx = 0;

        for (; ; ) {
            res[idx++] = mat[row][col];
            int nr = row, nc = col;
            if (up) {
                if (row - 1 >= 0 && col + 1 < n) {
                    nr = row - 1;
                    nc = col + 1;
                } else {
                    if (col + 1 < n) {
                        nc = col + 1;
                    } else {
                        nr = row + 1;
                    }
                    up = false;
                }
            } else {
                if (row + 1 < m && col - 1 >= 0) {
                    nr = row + 1;
                    nc = col - 1;
                } else {
                    if (row + 1 < m) {
                        nr = row + 1;
                    } else {
                        nc = col + 1;
                    }
                    up = true;
                }
            }
            if (row == m - 1 && col == n - 1)
                break;
            row = nr;
            col = nc;
        }
        return res;
    }
}
