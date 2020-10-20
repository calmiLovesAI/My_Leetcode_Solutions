package from_1_to_200.P142_环形链表II;

import java.util.List;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null){
            slow = slow.next;
            if (fast.next != null){
                fast = fast.next.next;
            }else {
                return null;
            }

            if (slow == fast){
                ListNode p = head;
                while (p != slow){
                    p = p.next;
                    slow = slow.next;
                }
                return p;
            }
        }
        return null;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
