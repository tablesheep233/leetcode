package org.table.other;

/**
 * 如果一个数列 至少有三个元素 ，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 *
 * 例如，[1,3,5,7,9]、[7,7,7,7] 和 [3,-1,-5,-9] 都是等差数列。
 * 给你一个整数数组 nums ，返回数组 nums 中所有为等差数组的 子数组 个数。
 *
 * 子数组 是数组中的一个连续序列。
 *
 */
public class NumberOfArithmeticSlices_413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int res = 0, add = 0;
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                res += ++add;
            } else {
                add = 0;
            }
        }
        return res;

        // int n = 0;
        // int l = nums.length;
        // for(int i = 0; i < l - 2; i++) {
        //     int w = 0;
        //     for(int j = i + 1; j < l; j++) {
        //         if(j - i == 1) {
        //             w = nums[j] - nums[i];
        //         } else if (nums[j] - nums[j - 1] == w) {
        //             n++;
        //         } else {
        //             break;
        //         }
        //     }
        // }
        // return n;
    }
}
