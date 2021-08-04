package org.table.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 */
public class Combine_0077 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(n, k, 1, new ArrayList<Integer>(), res);
        return res;
    }

    private void backtracking(int n, int k, int start, List<Integer> list, List<List<Integer>> res) {
        if(list.size() == k) {
            res.add(new ArrayList(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            backtracking(n, k, i + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}
