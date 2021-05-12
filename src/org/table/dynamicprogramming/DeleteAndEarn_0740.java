package org.table.dynamicprogramming;

/**
 * 给你一个整数数组nums，你可以对它进行一些操作。
 *
 * 每次操作中，选择任意一个nums[i]，删除它并获得nums[i]的点数。之后，你必须删除每个等于nums[i] - 1或nums[i] + 1的元素。
 *
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 */
public class DeleteAndEarn_0740 {
    /**
     * 根据题意不能选nums[i] - 1或nums[i] + 1的的元素，即不能选大1或小1的元素，同时选了一个元素等于选了所有的相同元素
     * {1,1,2,3}  选了 1 不能选 2，同时相当于选了两个1
     * 创建新数组，下标表示nums的值，值表示相同元素的和，长度为nums数组的最大值+1，用n表示最大值
     * dp {0,2,2,3}
     * n = 1时，最大点数为 dp[1]
     * n = 2时，选了1不能选2，选了2不能选1，最大点数为 max(dp[1],dp[2])
     * n = 3时，选了1不能选2，选了2不能选1、3，选了3不能选2，最大点数为max(dp[1] + dp[3],dp[2])
     * 推导出dp方程：
     * n = 1, max = dp[1]
     * n = 2, max = max(dp[1], dp[2])
     * n > 2, max = dp[n] = max(dp[n-2] + dp[n], dp[n - 1])
     */
    public int deleteAndEarn(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int[] dp = new int[max + 1];
        for (int num : nums) {
            dp[num] += num;
        }
        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 2] + dp[i], dp[i - 1]);
        }
        return dp[max];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,3,1,2,3,2,2,2,2,2,2};
        DeleteAndEarn_0740 deleteAndEarn_0740 = new DeleteAndEarn_0740();
        System.out.println(deleteAndEarn_0740.deleteAndEarn(nums));
    }
}
