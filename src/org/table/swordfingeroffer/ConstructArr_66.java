package org.table.swordfingeroffer;

/**
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中B[i] 的值是数组 A 中除了下标 i 以外的元素的积,
 * 即B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 */
public class ConstructArr_66 {
    //每个元素左边的乘积与右边的乘积
    public int[] constructArr(int[] a) {
        if(a == null) {
            return null;
        }
        int length = a.length;
        int[] b = new int[length];
        for (int i = 0, p = 1; i < length; p *= a[i++]) {
            b[i] = p;
        }
        for (int i = length - 1, p = 1; i >= 0; p *= a[i--]) {
            b[i] *= p;
        }
        return b;
    }

    public static void main(String[] args) {
        ConstructArr_66 constructArr_66 = new ConstructArr_66();
        int[] array = {1,3,9,7,2};
        for (int i : constructArr_66.constructArr(array)) {
            System.out.println(i);
        }
    }
}
