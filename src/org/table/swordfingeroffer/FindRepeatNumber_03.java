package org.table.swordfingeroffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 */
public class FindRepeatNumber_03 {

//    public int findRepeatNumber(int[] nums) {
//        Map<Integer, Void> map = new HashMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num)) {
//                return num;
//            }
//            map.put(num, null);
//        }
//        throw new RuntimeException();
//    }

    //将数字放到对应的下标位置，当下标位置的值与当前值相等时就是重复的数字
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) {
                continue;
            }
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        throw new RuntimeException();
    }
}
