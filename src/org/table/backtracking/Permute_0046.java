package org.table.backtracking;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
public class Permute_0046 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res, new LinkedHashSet<Integer>(), nums.length, nums);
        return res;
    }

    private void backtracking(List<List<Integer>> res, LinkedHashSet<Integer> set, int l, int[] nums) {
        if(set.size() == l) {
            res.add(new ArrayList<>(set));
            return;
        }

        for (int i = 0; i < l; i++) {
            if(set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            backtracking(res, set, l, nums);
            set.remove(nums[i]);
        }
    }
}
