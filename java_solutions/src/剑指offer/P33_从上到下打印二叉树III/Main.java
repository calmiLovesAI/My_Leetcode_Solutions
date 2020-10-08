package 剑指offer.P33_从上到下打印二叉树III;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        if (root != null){
            q.addLast(root);
        }

        boolean mode = true;

        while (!q.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            int n = q.size();   // 下一层的节点数
            for (int k = n; k > 0; k--){
                TreeNode target = q.removeFirst();
                if (mode){
                    temp.addLast(target.val);
                }else{
                    temp.addFirst(target.val);
                }

                if (target.left != null){
                    q.addLast(target.left);
                }

                if (target.right != null){
                    q.addLast(target.right);
                }

            }

            mode = !mode;
            ans.add(temp);
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
