package org.table.string;

/**
 * <a href = "https://leetcode-cn.com/problems/count-and-say/">太长了</a>
 */
public class CountAndSay_0038 {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = countAndSay(s);
        }
        return s;
    }

    private String countAndSay(String s) {
        char[] chars = s.toCharArray();
        char c = chars[0];
        int n = 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == c) {
                n++;
            } else {
                stringBuffer.append(n).append(c);
                c = chars[i];
                n = 1;
            }
        }
        stringBuffer.append(n).append(c);
        return stringBuffer.toString();
    }
}
