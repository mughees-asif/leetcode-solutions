package com.mughees;

import java.util.*;

//Definition for singly-linked list.
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


public class Main {

    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list_1, ListNode list_2) {
        ListNode result = null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(Collections.reverseOrder());


        return result;
    }

}
