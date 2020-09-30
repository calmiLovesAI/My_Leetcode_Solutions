# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# 二叉搜索树的性质：
# 对于任意节点 root而言，左子树（如果存在）上所有节点的值均小于 root.val，
# 右子树（如果存在）上所有节点的值均大于 root.val，且它们都是二叉搜索树。


# 因此，当将 val插入到以 root为根的子树上时，根据 val与 root.val的大小关系，就可以确定要将 val插入到哪个子树中。
# 1、如果该子树不为空，则问题转化为将val插入到该子树上；
# 2、否则，在此处新建一个以val为值的节点，并链接到其父节点root上


class Solution:
    def insertIntoBST(self, root: TreeNode, val: int) -> TreeNode:
        if not root:
            return TreeNode(val)
        pos = root

        while pos:
            if val < pos.val:
                if not pos.left:
                    pos.left = TreeNode(val)
                    break
                else:
                    pos = pos.left
            else:
                if not pos.right:
                    pos.right = TreeNode(val)
                    break
                else:
                    pos = pos.right

        return root