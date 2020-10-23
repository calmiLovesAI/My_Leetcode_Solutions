# Definition for singly-linked list.

from collections import deque

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        stk = deque()
        p = head
        while p:
            stk.append(p.val)
            p = p.next
        while head:
            if head.val != stk.pop():
                return False
            head = head.next
        return True