package from_1_to_200.P86_分隔链表;

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

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


class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode();
        ListNode smallHead = small;
        ListNode large = new ListNode();
        ListNode largeHead = large;
        while (head != null){
            if (head.val < x){
                small.next = head;
                small = small.next;
            }else{
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }

        small.next = largeHead.next;
        large.next = null;
        return smallHead.next;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}
