package org.table.swordfingeroffer;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpace_05 {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}

