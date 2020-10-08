package 剑指offer.P32_从上到下打印二叉树I;


import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

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
    public int[] levelOrder(TreeNode root) {
        if (root == null){
            return new int[0];
        }
        // 二叉树的层序遍历

        ArrayList<TreeNode> ansNode = new ArrayList<>();

        LinkedList<TreeNode> queue = new LinkedList<>();
        // 初始化
        queue.addLast(root);

        while (!queue.isEmpty()){
            TreeNode front = queue.getFirst();
            queue.removeFirst();
            ansNode.add(front);
            if (front.left != null){
                queue.addLast(front.left);
            }
            if (front.right != null){
                queue.addLast(front.right);
            }
        }
        int[] ans  = new int[ansNode.size()];
        int i = 0;
        for (TreeNode node : ansNode) {
            ans[i] = node.val;
            i++;
        }

        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
