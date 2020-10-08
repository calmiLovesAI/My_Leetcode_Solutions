package 剑指offer.P32_从上到下打印二叉树II;

import com.sun.source.tree.Tree;

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
        }else{
            return ans;
        }


        int n = 1; // 第一层有1个节点

        while (!q.isEmpty()){
            List<Integer> arrayList = new ArrayList<>();
            int temp = n;
            n = 0;    // 记录下一层有多少个节点
            for (int k = temp; k > 0; k--){
                TreeNode front = q.getFirst();
                q.removeFirst();
                arrayList.add(front.val);
                if (front.left != null){
                    q.addLast(front.left);
                    n++;
                }
                if (front.right != null){
                    q.addLast(front.right);
                    n++;
                }
            }
            ans.add(arrayList);
        }

        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
