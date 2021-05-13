package org.table.swordfingeroffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 第一个只出现一次的字符
 */
public class FirstUniqChar_50 {
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap();
        char[] chars = s.toCharArray();
        for(char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : chars) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }
}
