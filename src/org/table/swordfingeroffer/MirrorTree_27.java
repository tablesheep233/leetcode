package org.table.swordfingeroffer;

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */
public class MirrorTree_27 {

    public TreeNode mirrorTree(TreeNode root) {
        mirror(root);
        return root;
    }

    private void mirror(TreeNode node) {
        if(node != null) {
            TreeNode t = node.left;
            node.left = node.right;
            node.right = t;
            mirror(node.left);
            mirror(node.right);
        }
    }
}
