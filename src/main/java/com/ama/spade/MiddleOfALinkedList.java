package com.ama.spade;

public class MiddleOfALinkedList {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode findMiddleNode(ListNode head) {
        if (head == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
