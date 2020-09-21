# https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/



class Solution:
    def dfs(self, root):
        if not root:
            return 0
        left_depth = self.dfs(root.left)
        right_depth = self.dfs(root.right)
        if left_depth == 0:
            return right_depth + 1
        if right_depth == 0:
            return left_depth + 1
        return min(left_depth, right_depth) + 1


    def minDepth(self, root: TreeNode) -> int:
        # dfs算法：最小深度应该是  min(左子树的最小深度, 右子树的最小深度) + 1
        return self.dfs(root)




if __name__ == '__main__':
    pass