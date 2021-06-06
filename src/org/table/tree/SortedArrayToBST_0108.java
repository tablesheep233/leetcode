package org.table.tree;

/**
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 *
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 *
 */
public class SortedArrayToBST_0108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(0, nums.length - 1, nums);
    }

    private TreeNode sortedArrayToBST(int left, int right, int[] nums) {
        if(left > right) {
            return null;
        }
        int mid = (right + left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(left, mid - 1, nums);
        root.right = sortedArrayToBST(mid + 1, right, nums);
        return root;
    }
}
