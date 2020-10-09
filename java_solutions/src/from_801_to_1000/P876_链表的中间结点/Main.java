package from_801_to_1000.P876_链表的中间结点;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


class Solution {
    public ListNode middleNode(ListNode head) {
        // 快慢指针
        ListNode slow = head;
        ListNode quick = head;
        while (quick != null && quick.next != null){
            slow = slow.next;
            quick = quick.next.next;
        }
        return slow;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
