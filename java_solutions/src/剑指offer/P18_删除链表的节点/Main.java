package 剑指offer.P18_删除链表的节点;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
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
    public ListNode deleteNode(ListNode head, int val) {
        ListNode cur = head;
        ListNode pre = head;
        while (cur != null){
            if (cur.val == val){
                // 删除节点
                if (pre == cur){
                    return cur.next;
                }else {
                    pre.next = cur.next;
                    cur.next = null;
                    break;
                }
            }else{
                pre = cur;
                cur = cur.next;
            }

        }
        return head;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
