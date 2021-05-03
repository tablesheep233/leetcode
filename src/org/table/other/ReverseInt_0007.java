package org.table.other;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 */
public class ReverseInt_0007 {
    //当循环未结束时判断 结果 是否超出边界 / 10，若超过则下一位一定超出范围
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (res > Integer.MAX_VALUE / 10 || Integer.MIN_VALUE / 10 > res) {
                return 0;
            }
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        ReverseInt_0007 reverseInt_0007 = new ReverseInt_0007();
        System.out.println(reverseInt_0007.reverse(-2147483648));
    }
}
