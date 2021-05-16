package org.table.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *  二叉树的后序遍历
 */
public class PostorderTraversal_0145 {

    //递龟
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root, list);
        return list;
    }

    private void postorderTraversal(TreeNode node, List<Integer> list) {
        if (node != null) {
            postorderTraversal(node.left, list);
            postorderTraversal(node.right, list);
            list.add(node.val);
        }
    }
}