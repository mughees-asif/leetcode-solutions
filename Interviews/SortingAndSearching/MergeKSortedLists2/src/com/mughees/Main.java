package com.mughees;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Main {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> {return a.val - b.val;});
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }
        ListNode head = new ListNode(0);
        ListNode point = head;
        while (!minHeap.isEmpty()) {
            point.next = minHeap.poll();
            point = point.next;
            ListNode next = point.next;
            if (next != null) {
                minHeap.add(next);
            }
        }
        return head.next;
    }
}