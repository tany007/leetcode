package com.leetcode.LinkedList;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while (nodeA != nodeB) {
           if (nodeA != null) {
               nodeA = nodeA.next;
           } else {
               nodeA = headB;
           }

           if (nodeB != null) {
               nodeB = nodeB.next;
           } else {
               nodeB = headA;
           }

        }

        return nodeA;

    }

    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();

        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A: 4 -> 1 -> common
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B: 5 -> 6 -> 1 -> common
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode intersectionNode = intersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);
        System.out.println(intersectionNode == null ? "No intersection" : "Intersection at: " + intersectionNode.val);

    }
}
