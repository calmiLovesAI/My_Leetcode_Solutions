package 剑指offer.P34_二叉树中和为某一值的路径;

import java.util.ArrayList;
import java.util.Collections;
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

    private List<List<Integer>> ans;
    private List<Integer> path;


    private void dfs(TreeNode root, int sum, int currentSum){
        if (root == null){
            return;
        }
        path.add(root.val);
        currentSum += root.val;
        if (root.left == null && root.right == null && currentSum == sum){
            List<Integer> pathClone = new ArrayList<>(path);
            ans.add(pathClone);
        }
        // 递归遍历左右子树
        dfs(root.left, sum, currentSum);
        dfs(root.right, sum, currentSum);

        path.remove(path.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        // 递归遍历所有路径，判断和是不是等于sum
        ans = new ArrayList<>();
        path = new ArrayList<>();

        dfs(root, sum, 0);
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
