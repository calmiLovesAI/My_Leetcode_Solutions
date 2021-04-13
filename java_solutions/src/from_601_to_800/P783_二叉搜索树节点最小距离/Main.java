package from_601_to_800.P783_二叉搜索树节点最小距离;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){

    }

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {

    private int minVal;
    private int cur;

    private void dfs(TreeNode root){
        if (root == null){
            return;
        }
        dfs(root.left);
        minVal = Math.min(minVal, Math.abs(root.val - cur));
        cur = root.val;
        dfs(root.right);
    }


    public int minDiffInBST(TreeNode root) {
        minVal = Integer.MAX_VALUE;
        cur = Integer.MAX_VALUE;
        dfs(root);
        return minVal;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}
