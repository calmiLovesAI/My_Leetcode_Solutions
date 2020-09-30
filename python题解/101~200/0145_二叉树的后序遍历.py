

from typing import List

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# 递归解法
# 时间复杂度：O(n)，其中 nnn 是二叉搜索树的节点数。每一个节点恰好被遍历一次。
# 空间复杂度：为递归过程中栈的开销，平均情况下为O(log(n))，最坏情况下树呈现链状，为O(n)
class Solution1:
    def __init__(self):
        self.ans = []

    def postorderTraversal(self, root: TreeNode) -> List[int]:
        self.recursion(root)
        return self.ans

    def recursion(self, root):
        if not root:
            return
        self.recursion(root.left)
        self.recursion(root.right)
        self.ans.append(root.val)


# 迭代
# 我们也可以用迭代的方式实现方法一的递归函数，两种方式是等价的，区别在于递归的时候隐式地维护了一个栈，
# 而我们在迭代的时候需要显式地将这个栈模拟出来，其余的实现与细节都相同。

# 时间复杂度：O(n)，其中n是二叉搜索树的节点数。每一个节点恰好被遍历一次
# 空间复杂度：为迭代过程中显式栈的开销，平均情况下为 O(log(n))，最坏情况下树呈现链状，为 O(n)。


class Solution2:
    def postorderTraversal(self, root: TreeNode) -> List[int]:
        if not root:
            return list()

        res = list()
        stack = list()
        prev = None

        while root or stack:
            while root:
                stack.append(root)
                root = root.left
            root = stack.pop()
            if not root.right or root.right == prev:
                res.append(root.val)
                prev = root
                root = None
            else:
                stack.append(root)
                root = root.right

        return res

