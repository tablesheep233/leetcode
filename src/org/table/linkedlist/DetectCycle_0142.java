package org.table.linkedlist;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。如果链表无环，则返回null。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 
 * 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
 *
 */
public class DetectCycle_0142 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p1 = head, p2 = head;
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next == null ? null : p2.next.next;
            if (p1 == p2) {
                ListNode pre = head;
                while (p1 != pre) {
                    p1 = p1.next;
                    pre = pre.next;
                }
                return pre;
            }
        }
        return null;
    }
}
