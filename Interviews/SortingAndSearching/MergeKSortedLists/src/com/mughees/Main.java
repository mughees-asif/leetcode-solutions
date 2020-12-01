package com.mughees;

//Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class Main {

    private static ListNode mergeTwoLists(ListNode l_1, ListNode l_2) {
        if (l_1 == null) {
            return l_2;
        }
        else if (l_2 == null) {
            return l_1;
        }
        else if (l_1.val < l_2.val) {
            l_1.next = mergeTwoLists(l_1.next, l_2);
            return l_1;
        }
        else {
            l_2.next = mergeTwoLists(l_1, l_2.next);
            return l_2;
        }
    }
}
