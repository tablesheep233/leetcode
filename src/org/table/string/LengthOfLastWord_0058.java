package org.table.string;

/**
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 */
public class LengthOfLastWord_0058 {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int i = chars.length - 1;
        while (i >= 0 && chars[i] == ' ') {
            i--;
        }
        int length = 0;
        while (i >= 0 && chars[i] != ' ') {
            i--;
            length++;
        }
        return length;
    }
}
