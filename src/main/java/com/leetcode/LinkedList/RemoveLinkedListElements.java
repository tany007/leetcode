package com.leetcode.LinkedList;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        if (head==null)
            return null;

        if (head.next == null)
            return null;

        while(curr!=null) {
            if(curr.val == val) {
               prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        removeLinkedListElements.removeElements(new ListNode(), 1);
    }
}
