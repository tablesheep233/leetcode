package org.table.normal;

/**
 * Fibonacci
 */
public class Fib {
    //递归
//    public int fib(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return (fib(n - 1) + fib(n - 2)) %= 1000000007;
//    }

    //动态规划
//    public int fib(int n) {
//        if(n == 0) {
//            return 0;
//        }
//        int dp[] = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i-1] + dp[i-2];
//            dp[i] %= 1000000007;
//        }
//        return dp[n];
//    }

    //交换变量
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int x = 0, y = 1;
        for (int i = 2; i <= n; i++) {
            int temp = (x + y) % 1000000007;
            x = y;
            y = temp;
        }
        return y;
    }
}
