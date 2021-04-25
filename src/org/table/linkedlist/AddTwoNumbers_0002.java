package org.table.linkedlist;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
 * and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 */
public class AddTwoNumbers_0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode node = result;
        int temp = 0;
        while (l1 != null || l2 != null || temp != 0) {
            if (l1 != null) {
                temp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp += l2.val;
                l2 = l2.next;
            }
            node.val = temp % 10;
            temp /= 10;
            if (l1 != null || l2 != null || temp != 0) {
                node.next = new ListNode();
                node = node.next;
            }
        }
        return result;
    }
}
