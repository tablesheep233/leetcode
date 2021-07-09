package org.table.other;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class SortedSquares_0977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0, j = nums.length - 1, index = j; index >= 0; --index) {
            if(nums[i] * nums[i] > nums[j] * nums[j]) {
                result[index] = nums[i] * nums[i];
                i++;
            } else {
                result[index] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}
