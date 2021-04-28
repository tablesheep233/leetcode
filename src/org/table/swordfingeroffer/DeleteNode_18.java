package org.table.swordfingeroffer;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 */
public class DeleteNode_18 {
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public ListNode deleteNode(ListNode head, int val) {
         if(head.val == val) {
             return head.next;
         }
         ListNode pre = head, node = head.next;
         while (node.val != val && node.next != null) {
             pre = node;
             node = node.next;
         }
         if (node.val == val) {
             pre.next = node.next;
         }
         return head;
    }
}
