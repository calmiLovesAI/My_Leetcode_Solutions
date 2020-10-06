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


// 使用双指针
class Solution2{
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode t = cur.next;
            cur.next = pre;
            pre = cur;
            cur = t;
        }
        return pre;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
