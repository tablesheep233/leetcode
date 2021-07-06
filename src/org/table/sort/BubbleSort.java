package org.table.sort;

public class BubbleSort {
    private static void bubble(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,8,1,0,1,3,2,2,9};
        bubble(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
