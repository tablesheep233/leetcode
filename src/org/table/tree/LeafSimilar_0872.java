package org.table.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个叶值序列 。
 *
 * 举个例子，如上图所示，给定一棵叶值序列为(6, 7, 4, 9, 8)的树。
 *
 * 如果有两棵二叉树的叶值序列是相同，那么我们就认为它们是叶相似的。
 *
 * 如果给定的两个根结点分别为root1 和root2的树是叶相似的，则返回true；否则返回 false 。
 *
 */
public class LeafSimilar_0872 {
    //递龟法深度遍历
//    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        List<Integer> l1 = new ArrayList<>();
//        leaf(root1, l1);
//        List<Integer> l2 = new ArrayList<>();
//        leaf(root2, l2);
//        return l1.equals(l2);
//    }
//
//    private void leaf(TreeNode node, List<Integer> list) {
//        if (node.left == null && node.right == null) {
//            list.add(node.val);
//        }
//        if (node.left != null) {
//            leaf(node.left, list);
//        }
//        if (node.right != null) {
//            leaf(node.right, list);
//        }
//    }


    //迭代法
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        leaf(root1, l1);
        List<Integer> l2 = new ArrayList<>();
        leaf(root2, l2);
        return l1.equals(l2);
    }

    //模拟递归
    private void leaf(TreeNode node, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                //将左节点放入栈中
                stack.push(node);
                node = node.left;
            }
            //相当于取出最深的节点
            node = stack.pop();
            if (node.left == null && node.right == null) {
                list.add(node.val);
            }
            //遍历其右节点
            node = node.right;
        }
    }

    public static void main(String[] args) {
        LeafSimilar_0872 leafSimilar_0872 = new LeafSimilar_0872();
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root2 = new TreeNode(3, new TreeNode(2), new TreeNode(3));
        System.out.println(leafSimilar_0872.leafSimilar(root1, root2));
    }
}
