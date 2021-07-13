package org.table.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring_0003 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0, r = -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i != 0) {
                set.remove(chars[i - 1]);
            }
            while(r + 1 < chars.length && !set.contains(chars[r + 1])) {
                r++;
                set.add(chars[r]);
            }
            res = Math.max(res, r - i + 1);
        }
        return res;
    }
}
