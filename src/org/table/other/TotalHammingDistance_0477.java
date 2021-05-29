package org.table.other;

/**
 * 两个整数的 汉明距离 指的是这两个数字的二进制数对应位不同的数量。
 *
 * 给你一个整数数组 nums，请你计算并返回 nums 中任意两个数之间汉明距离的总和。
 */
public class TotalHammingDistance_0477 {

    public int totalHammingDistance(int[] nums) {
        int res = 0, l = nums.length;
        for(int i = 0; i < 30; i++) {
            int c = 0;
            for(int n : nums) {
                c += (n>>i) & 1;
            }
            res += c * (l - c);
        }
        return res;
    }
}
