package com.withyou.doublepoint;

import java.util.Arrays;

/**
 * @author withyou
 * @desc
 * @create 2024/11/15 00:02
 */
public class DoublePoint02 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length, sum = 0;
        for (int i = 0; i < len; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
