
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

# 方法一：set()集合检查重复元素
# 时间复杂度： O(N)，空间复杂度：O(N)
class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        ans = False
        node_set = set()
        p = head
        while p:
            if p in node_set:
                ans = True
                break
            else:
                node_set.add(p)
            p = p.next
        return ans


# 方法二：快慢指针
# 时间复杂度： O(N)，空间复杂度：O(1)
# 定义两个指针，一快一满。慢指针每次只移动一步，而快指针每次移动两步。初始时，慢指针在位置 head，而快指针在位置 head.next。这样一来，如果在移动的过程中，快指针反过来追上慢指针，就说明该链表为环形链表。否则快指针将到达链表尾部，该链表不为环形链表。
class Solution2:
    def hasCycle(self, head: ListNode) -> bool:
        if not head or not head.next:
            return False
        slow = head
        fast = head.next

        while fast != slow:
            if not fast or not fast.next:
                return False
            # 移动两步
            fast = fast.next.next
            # 移动一步
            slow = slow.next
        return True