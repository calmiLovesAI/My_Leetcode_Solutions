package from_1_to_200.P2_两数相加;


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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addValue = 0;
        ListNode head = null;
        ListNode tail = null;
        while (l1 != null || l2 != null){
            int n1 = 0;
            if (l1 != null) {
                n1 = l1.val;
            }
            int n2 = 0;
            if (l2 != null){
                n2 = l2.val;
            }
            int sum = n1 + n2 + addValue;

            if (head == null){
                head = tail = new ListNode(sum % 10);
            }else{
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            addValue = sum / 10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }

        if (addValue > 0){
            tail.next = new ListNode(addValue);
        }
        return head;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
