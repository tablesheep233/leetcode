package org.table.swordfingeroffer;

/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 */
public class CuttingRope_14 {

    //动态规划
    public int cuttingRope(int n) {
        if (n < 3) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i < n + 1; i++) {
            //每次剪2以上，所有的情况
            for (int j = 2; j < i ; j++) {
                //可剪j*dp[i-j]可不剪j*(i-j)，取大的，最后在所有情况中选最大的
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
