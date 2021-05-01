package org.table.swordfingeroffer;

/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 * 动态规划，每一位的最大子数组=max(本位，本位+前一位最大)
 * 取最大的子数组
 */
public class MaxSubArray_42 {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            result = Math.max(nums[i], result);
        }
        return result;
    }
}