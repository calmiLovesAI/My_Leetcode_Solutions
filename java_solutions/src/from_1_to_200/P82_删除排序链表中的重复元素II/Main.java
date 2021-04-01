package from_1_to_200.P82_删除排序链表中的重复元素II;

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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode prefix = new ListNode(0, head);
        ListNode cur = prefix;

        while (cur.next != null && cur.next.next != null){
            if (cur.next.val == cur.next.next.val){
                int x = cur.next.val;
                while (cur.next!=null && cur.next.val == x){
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }
        return prefix.next;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
