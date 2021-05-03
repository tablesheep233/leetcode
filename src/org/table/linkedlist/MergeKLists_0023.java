package org.table.linkedlist;

/**
 * 给你一个链表数组，每个链表都已经按升序排列。
 *
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 */
public class MergeKLists_0023 {
    //采用分治法合并，二条二条合
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeLists(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        } else if (l > r) {
            return null;
        }
        int mid = (l + r) >> 1;
        return mergeTwoList(mergeLists(lists, l, mid), mergeLists(lists, mid + 1, r));
    }

    private ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode node = temp;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        node.next = l1 == null ? l2 : l1;
        return temp.next;
    }
}
