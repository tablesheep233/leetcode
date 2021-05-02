package org.table.other;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class LongestPalindrome_0005 {
    // 傻瓜遍历法 。。。
    public String longestPalindrome(String s) {
        int index  = 0;
        int max = 1;
        char[] chars = s.toCharArray();
        for(int l = 0; l < chars.length - 1; l++) {
            for (int r = chars.length - 1; r >= l; r--) {
                if (isPalindrome(chars, l, r) && max < r - l + 1) {
                    max = r - l + 1;
                    index = l;
                }
            }
        }
        return String.copyValueOf(chars, index, max);
    }

    private boolean isPalindrome(char[] chars, int s, int e) {
        if (chars.length > e && s <= e) {
            while (s <= e) {
                if (chars[s++] != chars[e--]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aa";
        LongestPalindrome_0005 longestPalindrome_0005 = new LongestPalindrome_0005();
        System.out.println(longestPalindrome_0005.longestPalindrome(s));
    }
}
