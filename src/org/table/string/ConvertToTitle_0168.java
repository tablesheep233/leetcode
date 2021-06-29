package org.table.string;

/**
 * 给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。
 *
 */
public class ConvertToTitle_0168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber--;
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}

