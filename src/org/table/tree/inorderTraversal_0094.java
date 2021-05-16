package org.table.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的中序遍历
 *
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 */
public class inorderTraversal_0094 {

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        inorderTraversal(root, list);
//        return list;
//    }
//
//    private void inorderTraversal(TreeNode node, List<Integer> list) {
//        if (node != null) {
//            if (node.left != null) {
//                inorderTraversal(node.left, list);
//            }
//            list.add(node.val);
//            if (node.right != null) {
//                inorderTraversal(node.right, list);
//            }
//        }
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
