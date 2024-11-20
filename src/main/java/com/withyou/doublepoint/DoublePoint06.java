package com.withyou.doublepoint;

/**
 * @author withyou
 * @desc
 * @create 2024/11/20 19:23
 */
public class DoublePoint06 {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, res = Integer.MAX_VALUE, sum = 0;
        while (right <= nums.length) {
            if (right == nums.length)
                break;
            sum += nums[right];
            if (sum >= target) {
                do {
                    res = Math.min(res, right - left + 1);
                    sum -= nums[left++];
                } while (sum >= target);
            }
            right++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
