package 剑指offer.P6_从尾到头打印链表;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

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


// 使用栈
class Solution {
    public int[] reversePrint(ListNode head) {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        while (head != null) {
            deque.addLast(head.val);
            head = head.next;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!deque.isEmpty()) {
            ans.add(deque.removeLast());
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
