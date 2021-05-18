package org.table.sort;

/**
 * 插入排序
 */
public class InsertionSort {
    private static void insertion(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrays[j] < arrays[j - 1]) {
                    int t = arrays[j];
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,8,1,0,1,3,2,2,9};
        insertion(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
