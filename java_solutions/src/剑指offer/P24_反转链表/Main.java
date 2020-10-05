package 剑指offer.P24_反转链表;


import java.util.ArrayDeque;

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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode p = head;
        // 使用栈
        ArrayDeque<ListNode> arrayDeque = new ArrayDeque<>();
        while (p!=null){
            arrayDeque.addLast(new ListNode(p.val));
            p = p.next;
        }
        ListNode ans = arrayDeque.getLast();
        while (!arrayDeque.isEmpty()){
            ListNode t = arrayDeque.removeLast();
            if(arrayDeque.isEmpty()){
                t.next = null;
            }else{
                t.next = arrayDeque.getLast();
            }
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
