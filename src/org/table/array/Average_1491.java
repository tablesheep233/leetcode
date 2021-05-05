package org.table.array;

/**
 * 给你一个整数数组salary，数组里每个数都是 唯一的，其中salary[i] 是第i个员工的工资。
 *
 * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
 */
public class Average_1491 {
    //注意细节double
    public double average(int[] salary) {
        double max = salary[0], min = salary[0], sum = 0d;
        for (int i : salary) {
            max = Math.max(i, max);
            min = Math.min(i, min);
            sum += i;
        }
        return (sum - max - min) / (salary.length - 2);
    }
}
