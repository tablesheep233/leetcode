package org.table.normal;

/**
 * Fibonacci
 */
public class Fib {
//    public int fib(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return (fib(n - 1) + fib(n - 2)) %= 1000000007;
//    }

    public int fib(int n) {
        if(n == 0) {
            return 0;
        }
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }
}
