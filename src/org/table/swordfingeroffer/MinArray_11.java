package org.table.swordfingeroffer;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 */
public class MinArray_11 {
    public static int minArray(int[] numbers) {
        //傻瓜遍历
//        if (numbers == null || numbers.length == 0) {
//            return -1;
//        }
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i - 1] > numbers[i]) {
//                return numbers[i];
//            }
//        }
//        return numbers[0];

        //二分法
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int m  = (l + r) >> 1;
            if (numbers[m] > numbers[r]) {
                l = m + 1;
            } else if (numbers[m] < numbers[r]) {
                r = m;
            } else {
                r--;
            }
        }
        return numbers[l];
    }
}
