package com.withyou.doublepoint;

/**
 * @author withyou
 * @desc
 * @create 2024/11/20 19:19
 */
public class DoublePoint03 {

    public int[] twoSum(int[] numbers, int target) {
        int idx1 = 0, idx2 = numbers.length - 1;
        while(idx1 < idx2) {
            int sum = numbers[idx1] + numbers[idx2];
            if (sum == target)
                return new int[] {idx1 + 1, idx2 + 1};
            else if (sum < target)
                idx1++;
            else
                idx2--;
        }
        return new int[2];
    }
}
