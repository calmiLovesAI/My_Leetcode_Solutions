package from_1_to_200.P160_相交链表;


import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode node = headA;
        while (node != null){
            hashSet.add(node);
            node = node.next;
        }
        node = headB;
        while (node != null){
            if (hashSet.contains(node)){
                return node;
            }
            node = node.next;
        }
        return null;
    }
}





public class Main {
    public static void main(String[] args) {

    }
}
