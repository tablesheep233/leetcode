package org.table.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * 移除未排序链表中的重复节点。保留最开始出现的节点。
 */
public class RemoveDuplicateNodes_m0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        ListNode node = head;
        set.add(node.val);
        //判断下个节点是否重复
        while (node.next != null) {
            //是则移除，判断下下个节点
            if (set.contains(node.next.val)) {
                node.next = node.next.next;
            } else {
                //否则将节点下移
                set.add(node.next.val);
                node = node.next;
            }
        }
        return head;
    }
}
