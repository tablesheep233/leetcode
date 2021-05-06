package org.table.swordfingeroffer;

/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */
public class SingleNumbers_56 {
    // 所有数异或起来等于不同的两个数异或，根据最低的不同位进行分组
    public int[] singleNumbers(int[] nums) {
        int temp = 0;
        for (int num : nums) {
            temp = temp ^ num;
        }
        int mark = 1;
        while ((temp & mark) == 0) {
            mark <<= 1;
        }

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & mark) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] nums = {4,1,4,6};
        SingleNumbers_56 singleNumbers_56 = new SingleNumbers_56();
        for (int i : singleNumbers_56.singleNumbers(nums)) {
            System.out.println(i);
        }
    }
}
