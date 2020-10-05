package 剑指offer.P22_链表中倒数第k个节点;


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
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 双指针
        int i = 1;
        ListNode iPointer = head;
        int j = 1;
        ListNode cur = head;
        while (j-i<k){
            j++;
            cur = cur.next;
        }
        while (cur!=null){
            cur = cur.next;
            i++;
            iPointer = iPointer.next;
            j++;
        }
        return iPointer;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
