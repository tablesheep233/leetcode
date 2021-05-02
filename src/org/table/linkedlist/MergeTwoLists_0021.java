package org.table.linkedlist;


/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoLists_0021 {
    //建立临时节点作为head 的前置节点，遍历两个链表，数值小的为下一个节点，直到一个链表为空，将另一个直接拼接至最后
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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

    public static void main(String[] args) {
        MergeTwoLists_0021 mergeTwoLists_0021 = new MergeTwoLists_0021();
        ListNode head = mergeTwoLists_0021.mergeTwoLists(new ListNode(1, new ListNode(2)),
                (new ListNode(1, new ListNode(2))));
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
