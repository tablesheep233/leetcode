package org.table.swordfingeroffer;

/**
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 *
 */
public class SumNums_64 {

    public int sumNums(int n) {
        int sum = n;
        boolean bol = n > 0 && (sum += sumNums(n - 1)) > 0;
        return sum;
    }

    public static void main(String[] args) {
        SumNums_64 sumNums_64 = new SumNums_64();
        System.out.println(sumNums_64.sumNums(3));
    }
}
