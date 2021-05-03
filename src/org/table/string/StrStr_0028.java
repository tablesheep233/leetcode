package org.table.string;

/**
 * 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1 。
 *
 */
public class StrStr_0028 {
    //老实遍历法
//    public int strStr(String haystack, String needle) {
//        if (needle == null || needle.isEmpty()) {
//            return 0;
//        }
//        int haystackLength = haystack.length();
//        int needleLength = needle.length();
//        char[] chars = haystack.toCharArray();
//        char[] nchars = needle.toCharArray();
//        for (int i = 0; i <= haystackLength - needleLength; i++) {
//            boolean res = true;
//            for (int j = 0; j < needleLength; j++) {
//                if (chars[i + j] != nchars[j]) {
//                    res = false;
//                    break;
//                }
//            }
//            if (res) {
//                return i;
//            }
//        }
//        return -1;
//    }

    //实际开发法
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    //kpm算法 (emmm.. 从不匹配的字符串里面根据相同前缀确定新起始位置,减少遍历的次数..说得简单..目前完全写不出来..)

    public static void main(String[] args) {
        String haystack = "aaabb";
        String needle = "ab";
        StrStr_0028 strStr_0028 = new StrStr_0028();
        System.out.println(strStr_0028.strStr(haystack, needle));
        System.out.println(haystack.indexOf(needle));
    }
}
