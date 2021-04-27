package org.table.swordfingeroffer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class NumWays_10 {

    public int numWays(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int x = 1;
        int y = 2;
        for (int i = 3; i <= n; i++) {
            int temp = (x + y) % 1000_000_007;
            x = y;
            y = temp;
        }
        return y;
    }
}
