# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        pre = ListNode()
        p = head
        q = p.next
        ans = q
        while q:
            p.next = q.next
            q.next = p
            pre.next = q
            # 更新
            pre = pre.next.next
            p = p.next
            if not p or not p.next:
                break
            q = p.next
        return ans