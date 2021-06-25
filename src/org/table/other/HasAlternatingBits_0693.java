package org.table.other;

/**
 * 给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：换句话说，就是二进制表示中相邻两位的数字永不相同。
 */
public class HasAlternatingBits_0693 {
    public static boolean hasAlternatingBits(int n) {
        n = (n ^ (n >> 1)) + 1;
        return (n & (n - 1)) == 0;
    }
}
