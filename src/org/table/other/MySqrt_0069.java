package org.table.other;

/**
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class MySqrt_0069 {
    //细节贼多，边界，死循环，溢出。。。。
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int n = x / mid;
            if (n == mid) {
                return mid;
            } else if (mid > n) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        MySqrt_0069 mySqrt_0069 = new MySqrt_0069();
        System.out.println(mySqrt_0069.mySqrt(8));
    }
}
