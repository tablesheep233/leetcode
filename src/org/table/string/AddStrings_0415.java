package org.table.string;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 */
public class AddStrings_0415 {

    public String addStrings(String num1, String num2) {
        if(num1 == null) {
            return num2;
        } else if(num2 == null) {
            return num1;
        } else {
            StringBuilder sb = new StringBuilder();
            int c = 0;
            int i = num1.length() - 1;
            int j = num2.length() - 1;
            while(i >= 0 || j >= 0) {
                int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
                int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
                int tmp = n1 + n2 + c;
                c = tmp / 10;
                sb.append(tmp % 10);
                i--; j--;
            }
            if(c == 1) sb.append(1);
            return sb.reverse().toString();
        }
    }
}
