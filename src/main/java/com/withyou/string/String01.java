package com.withyou.string;

/**
 * @author withyou
 * @desc
 * @create 2024/11/8 21:33
 */
public class String01 {

    // ****************************************
    // 纵向比较的过程
    // ****************************************

    public String longestCommonPrefix(String[] strs) {
        int idx = 0;
        while (idx != strs[0].length()) {
            char c = strs[0].charAt(idx);
            for (String str : strs) {
                if (idx >= str.length() || c != str.charAt(idx))
                    return strs[0].substring(0, idx);
            }
            idx++;
        }
        return strs[0].substring(0, idx);
    }
}
