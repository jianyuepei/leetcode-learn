package com.withyou.matrixArr;

/**
 * @author withyou
 * @desc
 * @create 2024/11/6 23:47
 */
public class MatrixArr01 {

    // ****************************************
    // 找规律旋转
    // 首先根据 N 值判断奇偶数
    // N 为奇数 i < N / 2 + 1 而此时 j < N / 2 + 1 - 1, 不 -1 会造成中间列计算两次，结果不对
    // N 为偶数 i < N / 2 且 j < N / 2
    // 使用 do while 结构保证先进行一次旋转，当 bi == i && bj == j 时退出旋转
    // ****************************************

    public void rotate(int[][] matrix) {
        int N = matrix.length;
        int boundary = N % 2 == 0 ? N / 2 : N / 2 + 1;
        int diff = (N % 2) == 0 ? 0 : 1;
        for (int i = 0; i < boundary; i++) {
            for (int j = 0; j < boundary - diff; j++) {
                int bi = i, bj = j, bv = matrix[bi][bj];
                do {
                    int ci = bj, cj = N - 1 - bi;
                    int cv = matrix[ci][cj];
                    matrix[ci][cj] = bv;
                    bi = ci;
                    bj = cj;
                    bv = cv;
                } while (bi != i || bj != j);
            }
        }
    }
}
