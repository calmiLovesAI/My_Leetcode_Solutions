package 剑指offer.P25_合并两个排序的链表;


import java.util.List;

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = new ListNode(0);
        ListNode ans = head;
        while (p1 != null && p2 != null){
            if(p1.val < p2.val){
                ans.next = p1;
                ans = ans.next;
                p1 = p1.next;
            }else{
                ans.next = p2;
                ans = ans.next;
                p2 = p2.next;
            }
        }

        while (p1 != null){
            ans.next = p1;
            ans = ans.next;
            p1 = p1.next;
        }

        while (p2 != null){
            ans.next = p2;
            ans = ans.next;
            p2 = p2.next;
        }

        return head.next;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
