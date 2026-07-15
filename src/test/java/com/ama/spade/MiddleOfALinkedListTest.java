package com.ama.spade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfALinkedListTest {
    private final MiddleOfALinkedList middleOfALinkedList = new MiddleOfALinkedList();

    @Test
    public void shouldReturnMiddleNode() {
        MiddleOfALinkedList.ListNode head = new MiddleOfALinkedList.ListNode(1);
        head.next = new MiddleOfALinkedList.ListNode(2);
        head.next.next = new MiddleOfALinkedList.ListNode(3);
        head.next.next.next = new MiddleOfALinkedList.ListNode(4);
        head.next.next.next.next = new MiddleOfALinkedList.ListNode(5);
        head.next.next.next.next.next = null;

        MiddleOfALinkedList.ListNode middleNode = middleOfALinkedList.findMiddleNode(head);

        assertEquals(3, middleNode.val);
    }

    @Test
    public void shouldReturnMiddleNodeWhenInputHasEvenNumberOfElements() {
        MiddleOfALinkedList.ListNode head = new MiddleOfALinkedList.ListNode(1);
        head.next = new MiddleOfALinkedList.ListNode(2);
        head.next.next = new MiddleOfALinkedList.ListNode(3);
        head.next.next.next = new MiddleOfALinkedList.ListNode(4);
        head.next.next.next.next = null;

        MiddleOfALinkedList.ListNode middleNode = middleOfALinkedList.findMiddleNode(head);

        assertEquals(3, middleNode.val);
    }

    @Test
    public void shouldThrowExceptionIfInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> middleOfALinkedList.findMiddleNode(null));
    }

    @Test
    public void shouldReturnMiddleNodeWhenInputHasSingleElement() {
        MiddleOfALinkedList.ListNode head = new MiddleOfALinkedList.ListNode(1);
        head.next = null;

        MiddleOfALinkedList.ListNode middleNode = middleOfALinkedList.findMiddleNode(head);

        assertEquals(1, middleNode.val);
    }

}