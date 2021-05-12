package org.table.other;

/**
 * 给你一个整数数组perm，它是 <b>前</b> n个正整数的排列，且n是个 奇数。
 *
 * 它被加密成另一个长度为 n - 1的整数数组encoded，满足encoded[i] = perm[i] XOR perm[i + 1]。
 * 比方说，如果perm = [1,3,2]，那么encoded = [2,1]。
 *
 * 给你encoded数组，请你返回原始数组perm。题目保证答案存在且唯一。
 *
 */
public class Decode_1734 {

    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] perm = new int[n];

        //隔一位可得最后一个以外的异或
        int a = 0;
        for (int i = 0; i < encoded.length; i += 2) {
            a ^= encoded[i];
        }

        //perm 是前n个正整数的排列，可以获得1-n的异或
        int b = 0;
        for (int i = 1; i <= n; i++) {
            b ^= i;
        }

        perm[n - 1] = a ^ b;

        for (int i = n - 2; i >= 0; i--) {
            perm[i] = encoded[i] ^ perm[i + 1];
        }
        return perm;
    }

    public static void main(String[] args) {
        int[] arrays = {3, 1};
        Decode_1734 decode_1734 = new Decode_1734();
        for (int i : decode_1734.decode(arrays)) {
            System.out.println(i);
        }
    }
}
