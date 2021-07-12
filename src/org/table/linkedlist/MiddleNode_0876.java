package org.table.linkedlist;

/**
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class MiddleNode_0876 {
    public ListNode middleNode(ListNode head) {
        int i = 0;
        ListNode node = head;
        while(node != null) {
            i++;
            node = node.next;
        }
        i = i / 2;
        node = head;
        while(i != 0) {
            i--;
            node = node.next;
        }
        return node;
    }
}
