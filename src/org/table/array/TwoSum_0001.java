package org.table.array;

import org.table.Runner;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 给你一个整形数组和一个数字，返回数组中相加等于该数字的两个数组元素索引
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 你可以假设每个输入都只有一种解决方案，不能重复使用相同元素
 * You can return the answer in any order.
 * 你可以按照任意排序返回答案
 *
 * assume 认为，假设
 */
public class TwoSum_0001 implements Runner {
    /**
     * 使用map存储值与下标，遍历数组，查找目标-值 的key是否存在与map中
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t)) {
                result[0] = map.get(t);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }

    @Override
    public void run() {
        TwoSum_0001 twoSum_0001 = new TwoSum_0001();
        int[] nums = {2, 8, 79, 779, 7, -2, 1};
        int target = -1;
        System.out.print("arrays ");
        for (int num : nums) {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print(String.format("target %s", target));
        System.out.println();
        int[] result = twoSum_0001.twoSum(nums, target);
        System.out.println(String.format("result %s %s", result[0], result[1]));
    }
}
