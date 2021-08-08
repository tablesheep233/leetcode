package org.table.other;

/**
 * 泰波那契序列Tn定义如下：
 *
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *
 * 给你整数n，请返回第 n 个泰波那契数Tn 的值。
 */
public class Tribonacci_1137 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 3) {
            return 1;
        }
        int t1 = 0, t2 = 1, t3 = 1;
        for (int i = 3; i <= n; i++) {
            int t = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = t;
        }
        return t3;
    }
}
