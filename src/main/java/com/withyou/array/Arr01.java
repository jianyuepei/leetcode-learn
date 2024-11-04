package com.withyou.array;

/**
 * @author  withyou
 * @desc    寻找数组的中心索引
 * @create  2024/11/4 22:15
 */
public class Arr01 {

    // ****************************************
    // 此思路为求前缀和 + 后缀和再比较
    // 时间复杂度较高
    // ****************************************

    public int findMiddleIndex(int[] nums) {
        int len = nums.length;
        int[] left = new int[len], right = new int[len];
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < len; i++) {
            if (left[i] == right[i])
                return i;
        }
        return -1;
    }

    // ****************************************
    // 标准答案：
    // 先求所有元素的总和，再求左边和右边的值
    // 和上面的解法相比少了一次遍历
    // ****************************************

    public int findMiddleIndex2(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (left == sum - nums[i])
                return i;
            left += nums[i];
            sum -= nums[i];
        }
        return -1;
    }
}
