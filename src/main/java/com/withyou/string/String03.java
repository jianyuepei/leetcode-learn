package com.withyou.string;

import org.junit.Test;

import java.util.Stack;

/**
 * @author withyou
 * @desc
 * @create 2024/11/11 21:54
 */
public class String03 {


    @Test
    public void test() {
        String s = "a good   example";
        String words = reverseWords(s);
        System.out.println("words = " + words);
    }

    // ****************************************
    // 此题本省并不复杂
    // 1. 使用 trim() 函数移除两边的空格
    // 2. 使用 stack 和 chatAt 函数获取单词
    // ****************************************

    public String reverseWords(String s) {
        s = s.trim();
        if (s.isEmpty())
            return s;
        Stack<String> stack = new Stack<>();
        int l = 0, r = 0, len = s.length();
        while (l < len) {
            r = l;
            while(r < len && s.charAt(r) != ' ') {
                r++;
            }
            stack.push(s.substring(l, r));
            l = r;
            while (l < len && s.charAt(l) == ' ') {
                l++;
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
