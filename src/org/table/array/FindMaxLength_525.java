package org.table.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 */
public class FindMaxLength_525 {
    public int findMaxLength(int[] nums) {
        int c = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(c, -1);
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                c++;
            } else {
                c--;
            }
            if(map.containsKey(c)) {
                max = Math.max(max, i - map.get(c));
            } else {
                map.put(c, i);
            }
        }
        return max;
    }
}
