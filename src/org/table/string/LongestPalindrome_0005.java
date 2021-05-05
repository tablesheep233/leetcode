package org.table.string;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class LongestPalindrome_0005 {
    // 傻瓜遍历法 。。。
//    public String longestPalindrome(String s) {
//        int index  = 0;
//        int max = 1;
//        char[] chars = s.toCharArray();
//        for(int l = 0; l < chars.length - 1; l++) {
//            for (int r = chars.length - 1; r >= l; r--) {
//                if (isPalindrome(chars, l, r) && max < r - l + 1) {
//                    max = r - l + 1;
//                    index = l;
//                }
//            }
//        }
//        return String.copyValueOf(chars, index, max);
//    }
//
//    private boolean isPalindrome(char[] chars, int s, int e) {
//        if (chars.length > e && s <= e) {
//            while (s <= e) {
//                if (chars[s++] != chars[e--]) {
//                    return false;
//                }
//            }
//            return true;
//        }
//        return false;
//    }

    //中心遍历法
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int index = 0;
        int max = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int len = Math.max(isPalindrome(chars, i, i), isPalindrome(chars, i, i + 1));
            if (max < len) {
                max = len;
                //aa, a, aaa
                index = i - (len - 1) / 2;
            }
        }
        return String.copyValueOf(chars, index, max);
    }


    private int isPalindrome(char[] chars, int l, int r) {
        int len = 0;
        while (l >= 0 && r < chars.length && chars[l] == chars[r]) {
            len += l == r ? 1 : 2;
            l--;
            r++;
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "baaa";
        LongestPalindrome_0005 longestPalindrome_0005 = new LongestPalindrome_0005();
        System.out.println(longestPalindrome_0005.longestPalindrome(s));
    }
}
