package com.withyou.doublepoint;

/**
 * @author withyou
 * @desc
 * @create 2024/11/13 22:24
 */
public class DoublePoint01 {

    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (l <= r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
