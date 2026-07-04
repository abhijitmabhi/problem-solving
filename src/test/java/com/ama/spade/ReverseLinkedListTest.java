package com.ama.spade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    public void shouldReverseLinkedList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode result = reverseLinkedList.reverseList(head);

        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
    }

    @Test
    public void shouldReverseEmptyLinkedList() {
        ListNode result = reverseLinkedList.reverseList(null);

        assertNull(result);
    }

}