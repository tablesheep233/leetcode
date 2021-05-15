package org.table.array;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class MaxSubArray_0053 {

    //动态规划
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    //优化空间版
//    public int maxSubArray(int[] nums) {
//        int pre = nums[0], max = pre;
//        for (int i = 1; i < nums.length; i++) {
//            pre = Math.max(pre + nums[i], nums[i]);
//            max = Math.max(max, pre);
//        }
//        return max;
//    }
}
