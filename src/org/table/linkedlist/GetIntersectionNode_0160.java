package org.table.linkedlist;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 */
public class GetIntersectionNode_0160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA != null && headB != null) {
            ListNode p1 = headA;
            ListNode p2 = headB;
            while(p1 != null || p2 != null) {
                if(p1 == p2) {
                    return p1;
                }
                if(p1 == null) {
                    p1 = headB;
                } else if(p2 == null) {
                    p2 = headA;
                } else {
                    p1 = p1.next;
                    p2 = p2.next;
                }
            }
        }
        return null;
    }
}
