package org.table.tree;

/**
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * 初始状态下，所有next 指针都被设置为 NULL。
 *
 */
public class Connect_0116 {

    public Node connect(Node root) {
        connect(root, null, null);
        return root;
    }

    public void connect(Node node, Node right, Node parent) {
        if(node != null) {
            if(right != null) {
                node.next = right;
            } else if(parent != null) {
                if (parent.next != null) {
                    node.next = parent.next.left;
                }
            }
            connect(node.left, node.right, null);
            connect(node.right, null, node);
        }
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
