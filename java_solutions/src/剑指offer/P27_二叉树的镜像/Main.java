package 剑指offer.P27_二叉树的镜像;

import com.sun.source.tree.Tree;

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

    private void recursion(TreeNode node){
        if (node == null){
            return;
        }
        if (node.left == null && node.right == null){
            return;
        }
        TreeNode t = node.left;
        node.left = node.right;
        node.right = t;
        recursion(node.left);
        recursion(node.right);
    }


    public TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return null;
        }

        recursion(root);
        return root;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
