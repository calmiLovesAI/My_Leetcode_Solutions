

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


# 使用辅助栈、列表倒序都可以做
# 下面是使用递归的做法

from typing import List


class Solution:

    def reversePrint(self, head: ListNode) -> List[int]:
        if not head:
            return []
        ans = self.reversePrint(head.next)
        ans.append(head.val)
        return ans