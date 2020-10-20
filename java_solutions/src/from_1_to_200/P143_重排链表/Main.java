package from_1_to_200.P143_重排链表;


import java.util.HashMap;

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

// 方法一：使用HashMap存储当前节点和上一个节点的键值对，当然也可以采用栈来实现查找上一个节点
class Solution1 {
    public void reorderList(ListNode head) {
        HashMap<ListNode, ListNode> hashMap = new HashMap<>();
        ListNode pre, p;
        pre = head;
        if (pre == null) {
            return;
        }
        p = pre.next;
        while (p != null) {
            hashMap.put(p, pre);
            p = p.next;
            pre = pre.next;
        }
        // 链表尾部
        ListNode b = pre;
        // 链表头部
        ListNode a = head;
        while (a.next != b && a != b) {
            // 将b所指向的节点插入到a所指向的节点后面
            ListNode t = a.next;
            a.next = b;
            b.next = t;
            ListNode bPre = hashMap.get(b);
            bPre.next = null;

            // 更新
            a = t;
            b = bPre;
        }
    }
}


// 方法二：寻找链表中点 + 链表逆序 + 合并链表
class Solution2 {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode mid = middleNode(head);

        // 前一半保持原状，后一半反转，然后合并两个链表
        ListNode l1 = head;
        ListNode l2 = mid.next;
        mid.next = null;
        l2 = reverseList(l2);
        mergeList(l1, l2);
    }


    private ListNode middleNode(ListNode head) {
        // 快慢指针
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 反转链表
    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode t = cur.next;
            cur.next = pre;

            pre = cur;
            cur = t;
        }
        return pre;
    }

    // 合并两个链表
    private void mergeList(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            ListNode t1 = l1.next;
            ListNode t2 = l2.next;
            l1.next = l2;
            l2.next = t1;

            l2 = t2;
            l1 = t1;
        }
    }

}


public class Main {

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        Solution1 s1 = new Solution1();
        s1.reorderList(n1);

        printLinkedList(n1);
    }
}
