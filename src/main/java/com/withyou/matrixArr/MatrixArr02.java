package com.withyou.matrixArr;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author withyou
 * @desc
 * @create 2024/11/7 19:32
 */
public class MatrixArr02 {

    @Test
    public void test() {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println("ints = " + Arrays.toString(ints));
        }
    }

    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>(), colSet = new HashSet<>();
        int M = matrix.length, N = matrix[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (rowSet.contains(i) || colSet.contains(j))
                    matrix[i][j] = 0;
            }
        }
    }
}
