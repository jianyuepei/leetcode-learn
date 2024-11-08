package com.withyou.string;

import org.junit.Test;

/**
 * @author withyou
 * @desc
 * @create 2024/11/8 21:53
 */
public class String02 {

    @Test
    public void test() {
        String s = "cbbd";
        String string = longestPalindrome(s);
        System.out.println("string = " + string);
    }

    // ****************************************
    // 回文子串，分两种情况
    // 1.奇数子串
    // 2.偶数子串
    // ****************************************

    public String longestPalindrome(String s) {
        int length = s.length();
        String res = "";
        for (int i = 0; i < length; i++) {
            String s1 = singlePalindrome(s, i);
            String s2 = doublePalindrome(s, i);
            String max = s1.length() >= s2.length() ? s1 : s2;
            res = max.length() >= res.length() ? max : res;
        }
        return res;
    }

    private String singlePalindrome(String s, int idx) {
        int left = idx, right = idx + 1;
        while (left - 1 >= 0 && right + 1 <= s.length() && s.charAt(left - 1) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left, right);
    }

    private String doublePalindrome(String s, int idx) {
        if (idx + 1 == s.length() || s.charAt(idx) != s.charAt(idx + 1))
            return "";
        int left = idx, right = idx + 2;
        while (left - 1 >= 0 && right + 1 <= s.length() && s.charAt(left - 1) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left, right);
    }
}
