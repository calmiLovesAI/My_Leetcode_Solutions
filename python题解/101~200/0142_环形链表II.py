# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # 快慢指针
        slow = head
        quick = head

        while quick:
            slow = slow.next
            if not quick.next:
                return None
            quick = quick.next.next
            if slow == quick:
                p = head
                while p != slow:
                    p = p.next
                    slow = slow.next
                return p

        return None