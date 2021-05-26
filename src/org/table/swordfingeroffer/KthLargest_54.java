package org.table.swordfingeroffer;

/**
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 */
public class KthLargest_54 {

    int res = 0, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        center(root);
        return res;
    }

    private void center(TreeNode node) {
        if(node == null) {
            return;
        }
        center(node.right);
        if (--k == 0) {
            res = node.val;
            return;
        }
        center(node.left);
    }
}
