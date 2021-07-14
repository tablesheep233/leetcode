package org.table.string;

/**
 * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
 *
 * 换句话说，第一个字符串的排列之一是第二个字符串的 子串 。
 */
public class CheckInclusion_0567 {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        int[] array = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            array[s1.charAt(i) - 'a']++;
        }
        int l = 0, r = s1.length() - 1;
        int[] sub = new int[26];
        for(int i = l; i < r; i++) {
            sub[s2.charAt(i) - 'a']++;
        }
        while(r < s2.length()) {
            sub[s2.charAt(r++) - 'a']++;
            if(checkInclusion(array, sub)) {
                return true;
            }
            sub[s2.charAt(l++) - 'a']--;
        }
        return false;
    }

    private boolean checkInclusion(int[] s1, int[] s2) {
        for(int i = 0; i < 26; i++) {
            if(s1[i] == s2[i]) {
                continue;
            }
            return false;
        }
        return true;
    }
}
