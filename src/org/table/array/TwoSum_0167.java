package org.table.array;

/**
 * 给定一个已按照 升序排列 的整数数组numbers ，请你从数组中找出两个数满足相加之和等于目标数target 。
 *
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 */
public class TwoSum_0167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int[] result = new int[2];
        while(i < j) {
            int n = numbers[i] + numbers[j];
            if(n == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            } else if(n > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
}
