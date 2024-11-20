package com.withyou.doublepoint;

/**
 * @author withyou
 * @desc
 * @create 2024/11/20 19:22
 */
public class DoublePoint05 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int idx = 0, left = 0, right = 0, res = 0;
        while (idx < nums.length) {
            while (idx < nums.length && nums[idx] != 1) {
                idx++;
            }
            left = idx;
            right = idx;
            while (idx < nums.length && nums[idx] == 1) {
                idx++;
                right++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
