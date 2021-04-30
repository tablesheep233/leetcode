package org.table.swordfingeroffer;

import java.util.Arrays;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class GetLeastNumbers_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == k) {
            return arr;
        }
        quickSort(arr, 0, arr.length - 1);
        return Arrays.copyOfRange(arr, 0, k);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int partition = partition(arr, l, r);
            quickSort(arr, l, partition - 1);
            quickSort(arr,partition + 1, r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int i = l, j = r + 1;
        int temp = arr[i];
        while (true) {
            while (i != r && arr[++i] < temp);
            while (j != l && arr[--j] > temp);
            if (i >= j) {
                break;
            }
            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }
        int t = arr[j];
        arr[j] = arr[l];
        arr[l] = t;
        return j;
    }
}
