package org.table.array;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 */
public class PlusOne_0066 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            digits[i] = ++digits[i];
            if (digits[i] / 10 == 0) {
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
