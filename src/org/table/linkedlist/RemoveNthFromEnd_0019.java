package org.table.linkedlist;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class RemoveNthFromEnd_0019 {
    // 虚拟节点记录头位置，两个指针节点一前一后，后置节点先到n的位置，
    // 然后两个节点一起遍历直到后置节点到链表尾，此时前置节点即为要删除的节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode p1 = head, p2 = temp;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        RemoveNthFromEnd_0019 removeNthFromEnd_0019 = new RemoveNthFromEnd_0019();
        ListNode node = removeNthFromEnd_0019.removeNthFromEnd(head, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
