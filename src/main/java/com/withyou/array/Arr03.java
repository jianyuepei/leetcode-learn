package com.withyou.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author withyou
 * @desc
 * @create 2024/11/5 21:49
 */
public class Arr03 {

    // ****************************************
    // 核心思路：排序后合并
    // ****************************************

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int idx = 0;
        while (idx < intervals.length) {
            int start = idx, left = intervals[start][0], right = intervals[start][1], end = start + 1;
            while (end < intervals.length) {
                if (intervals[end][0] > right)
                    break;
                right = Math.max(right, intervals[end][1]);
                end++;
            }
            list.add(new int[]{left, right});
            idx = end;
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
