package org.table.dynamicprogramming;

/**
 * 给你一个整数数组nums，你可以对它进行一些操作。
 *
 * 每次操作中，选择任意一个nums[i]，删除它并获得nums[i]的点数。之后，你必须删除每个等于nums[i] - 1或nums[i] + 1的元素。
 *
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 */
public class DeleteAndEarn_0740 {
    //根据题意不能选+1 或 -1 的元素，选了一个元素即为选了所有的这个元素，构造数组长度为最大元素+1，各元素为所有该下标的值相加，
    // 最后根据dp[i] = max(dp[i-2]+dp[i],dp[i-1])得结果
    public int deleteAndEarn(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        int[] dp = new int[max + 1];
        for (int num : nums) {
            dp[num] += num;
        }
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + dp[i], dp[i - 1]);
        }
        return dp[max];
    }
}
