package from_801_to_1000.P897_递增顺序搜索树;


import com.sun.source.tree.Tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    private TreeNode resNode;

    private void inOrder(TreeNode root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        resNode.right = root;
        root.left = null;
        resNode = root;
        inOrder(root.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode ansNode = new TreeNode(-1);
        resNode = ansNode;
        inOrder(root);
        return ansNode.right;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}
