package org.table.string;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class AddBinary_0067 {

    public static String addBinary(String a, String b) {
        int la = a.length() - 1;
        int lb = b.length() - 1;
        int c = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (la > -1 || lb > -1 || c == 1) {
            if (la > -1) {
                c = c + (a.charAt(la--) - '0');
            }
            if (lb > -1) {
                c = c + (b.charAt(lb--) - '0');
            }
            stringBuilder.append(c % 2);
            c = c / 2;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String s =    "11";
        String s1 = "1000";
        System.out.println(addBinary(s, s1));
    }
}
