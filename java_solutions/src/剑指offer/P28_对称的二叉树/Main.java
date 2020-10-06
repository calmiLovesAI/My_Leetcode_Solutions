package 剑指offer.P28_对称的二叉树;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


class Solution {

    private boolean recursion(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return false;
        }
        if (t1.val != t2.val){
            return false;
        }
        return recursion(t1.left, t2.right) && recursion(t1.right, t2.left);
    }


    public boolean isSymmetric(TreeNode root) {
        boolean ans = false;
        if (root == null){
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        if (root.left == null || root.right == null){
            return false;
        }
        if (root.left.val == root.right.val){
            ans = recursion(root.left, root.right);
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
