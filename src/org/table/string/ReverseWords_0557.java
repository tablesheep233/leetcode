package org.table.string;

import java.util.Stack;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
public class ReverseWords_0557 {
    public String reverseWords(String s) {
        if(s == null) {
            return s;
        }
        StringBuilder rs = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                while(!stack.isEmpty()) {
                    rs.append(stack.pop());
                }
                rs.append(" ");
            } else {
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()) {
            rs.append(stack.pop());
        }
        return rs.toString();
    }
}
