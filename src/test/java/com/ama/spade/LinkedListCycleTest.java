package com.ama.spade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleTest {
    private final LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void shouldReturnTrueIfLinkedListHasCycle() {
        LinkedListCycle.ListNode head = new LinkedListCycle.ListNode(3);
        head.next = new LinkedListCycle.ListNode(2);
        head.next.next = new LinkedListCycle.ListNode(0);
        head.next.next.next = new LinkedListCycle.ListNode(-4);
        head.next.next.next.next = head.next;

        boolean result = linkedListCycle.hasCycle(head);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfLinkedListHasNoCycle() {
        LinkedListCycle.ListNode head = new LinkedListCycle.ListNode(3);
        head.next = new LinkedListCycle.ListNode(2);
        head.next.next = new LinkedListCycle.ListNode(0);
        head.next.next.next = new LinkedListCycle.ListNode(-4);
        head.next.next.next.next = null;

        boolean result = linkedListCycle.hasCycle(head);

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseIfLinkedListIsNull() {
        boolean result = linkedListCycle.hasCycle(null);

        assertFalse(result);
    }

}