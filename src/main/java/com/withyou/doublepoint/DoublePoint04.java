package com.withyou.doublepoint;

/**
 * @author withyou
 * @desc
 * @create 2024/11/20 19:20
 */
public class DoublePoint04 {

    public int removeElement(int[] nums, int val) {
        int idx1 = 0, idx2 = 0, res = 0;
        while (idx2 < nums.length) {
            if (nums[idx2] != val) {
                nums[idx1++] = nums[idx2];
                res++;
            }
            idx2++;
        }
        return res;
    }
}
