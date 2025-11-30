package com.leetcode.LinkedList;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = head;
        ListNode slow = head;

        if (head==null)
            return null;

        if (head.next == null)

        for(int i=0;i<n-1;i++) {
            if (fast==null)
                return head;
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;

    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        // 1,2,3,4,5
        removeNthNodeFromEndOfList.removeNthFromEnd(new ListNode(), 1);
    }
}
