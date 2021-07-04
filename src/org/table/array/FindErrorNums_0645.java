package org.table.array;

import java.util.HashSet;
import java.util.Set;

/**
 *
 集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有一个数字重复 。

 给定一个数组 nums 代表了集合 S 发生错误后的结果。

 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 */
public class FindErrorNums_0645 {

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int sum = 0, total = 0;
        for(Integer i : nums) {
            total += i;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            sum += i + 1;
            if(set.contains(nums[i])) {
                result[0] = nums[i];
                continue;
            }
            set.add(nums[i]);
        }
        result[1] = sum - total + result[0];
        return result;
    }
}
