package org.table.swordfingeroffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class ReversePrint_06 {

//    public int[] reversePrint(ListNode head) {
//        if(head == null) {
//            return new int[0];
//        }
//        return reversePrint(head, 1);
//    }
//
//    public int[] reversePrint(ListNode node, int length) {
//        int[] result;
//        if (node.next != null) {
//            int j = length;
//            result = reversePrint(node.next, ++length);
//            result[result.length - j] = node.val;
//        } else {
//            result = new int[length];
//            result[0] = node.val;
//        }
//        return result;
//    }

//    public int[] reversePrint(ListNode head) {
//        if(head == null) {
//            return new int[0];
//        }
//        List<Integer> list = new ArrayList<>();
//        do {
//            list.add(head.val);
//        } while ((head = head.next) != null);
//
//        int[] result = new int[list.size()];
//        int j = 0;
//        for (Integer i : list) {
//            result[j++] = i;
//        }
//        return result;
//    }

    public int[] reversePrint(ListNode head) {
        if(head == null) {
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        do {
            stack.push(head.val);
        } while ((head = head.next) != null);
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }
        return result;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
