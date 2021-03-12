package com.mughees;


  // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Main {
    public void reorderList(ListNode head) {
        findMiddle(head);
        reverse(head);
        mergeList(head);
    }

    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while(current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }

    public ListNode findMiddle(ListNode head) {
        ListNode current = head;
        ListNode previous = head;

        while(previous != null && previous.next != null) {
            current = head.next;
            previous = head.next.next;
        }

        return previous;
    }

    public ListNode mergeList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while(previous.next != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = temp;

            temp = previous.next;
            previous.next = current;
            previous = temp;
        }

        return previous;
    }
}