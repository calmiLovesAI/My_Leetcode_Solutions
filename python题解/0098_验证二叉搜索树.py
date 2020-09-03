
# https://leetcode-cn.com/problems/validate-binary-search-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

import math


class Solution:
    def isValidBST(self, root: TreeNode) -> bool:
        return self.dfs(root, - math.inf, math.inf)


    def dfs(self, root, min_v, max_v):
        if not root:
            return True
        if root.val < min_v or root.val > max_v:
            return False
        return self.dfs(root.left, min_v, root.val - 1) and self.dfs(root.right, root.val + 1, max_v)