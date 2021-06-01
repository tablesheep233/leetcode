package org.table.swordfingeroffer;

/**
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 */
public class MaxProfit_63 {

    public int maxProfit(int[] prices) {
        int max = 0;
        if(prices.length > 0) {
            int cost = prices[0];
            for(int price : prices) {
                cost = Math.min(price, cost);
                max = Math.max(max, price - cost);
            }
        }
        return max;
    }
}
