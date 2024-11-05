package com.withyou.array;

/**
 * @author  withyou
 * @desc    搜索插入位置
 * @create  2024/11/5 21:19
 */
public class Arr02 {

    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    // ****************************************
    // 首先数组有序 + O(log n)时间复杂度很容易想到二分查找
    // ****************************************

    private int search(int[] nums, int target, int left, int right) {
        // 这里处理插入位置
        // left > right 处理右边界，即 target > nums[nums.length - 1] 的情况
        // nums[left] >= target 处理数组内插入，即 nums = {1, 3, 5, 7} target = 4
        if (left > right || nums[left] >= target)
            return left;
        int middle = left + (right - left) / 2;
        // 这里处理数组内存在 target 的情况
        if (nums[middle] == target)
            return middle;
        else if (nums[middle] < target)
            return search(nums, target, middle + 1, right);
        else
            return search(nums, target, left, middle - 1);
    }
}
