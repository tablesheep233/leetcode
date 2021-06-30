package org.table.other;

/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */
public class SubtractProductAndSum_1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0, mul = 1;
        while(n != 0) {
            sum += n % 10;
            mul *= n % 10;
            n /= 10;
        }
        return mul - sum;
    }
}
