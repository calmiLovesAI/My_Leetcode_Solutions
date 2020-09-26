# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = ListNode(0)
        ans = head
        while l1 and l2:
            if l1.val < l2.val:
                ans.next = l1
                ans = ans.next
                l1 = l1.next
            else:
                ans.next = l2
                ans = ans.next
                l2 = l2.next
        print(ans.val)
        while l1:
            ans.next = l1
            ans = ans.next
            l1 = l1.next
        while l2:
            ans.next = l2
            ans = ans.next
            l2 = l2.next

        return head.next



if __name__ == '__main__':
    l1 = ListNode(-9)
    l1.next = ListNode(3)
    l2 = ListNode(5)
    l2.next = ListNode(7)

    res = Solution().mergeTwoLists(l1, l2)
    while res:
        print(res.val)
        res = res.next