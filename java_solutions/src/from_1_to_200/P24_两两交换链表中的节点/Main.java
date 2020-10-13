package from_1_to_200.P24_两两交换链表中的节点;

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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        // 前驱节点
        ListNode pre = new ListNode(0, null);
        ListNode p = head;
        ListNode q = head.next;

        ListNode ans = q;

        while (q != null){
            p.next = q.next;
            q.next = p;
            pre.next = q;

            // update
            pre = pre.next.next;
            p = p.next;
            if (p == null || p.next == null){
                break;
            }
            q = p.next;
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
