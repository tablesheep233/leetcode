package org.table.linkedlist;

/**
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 *
 * 返回同样按升序排列的结果链表。
 */
public class DeleteDuplicates_0083 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            ListNode node = head;
            while (node.next != null ) {
                if (node.val == node.next.val) {
                    node.next = node.next.next;
                } else {
                    node = node.next;
                }
            }
        }
        return head;
    }
}
