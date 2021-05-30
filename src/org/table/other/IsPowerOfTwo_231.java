package org.table.other;

/**
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 如果存在一个整数 x 使得n == 2x ，则认为 n 是 2 的幂次方。
 *
 */
public class IsPowerOfTwo_231 {

    /**
     * n - 1 对于2的幂的数相当于最高位1变为0，其他全为1
     */
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

//    public boolean isPowerOfTwo(int n) {
//        if(n > 0) {
//            int c = 0;
//            while(n != 0) {
//                if((n & 1) == 1) {
//                    c++;
//                }
//                if(c > 1) {
//                    return false;
//                }
//                n = n >> 1;
//            }
//            return true;
//        }
//        return false;
//    }
}
