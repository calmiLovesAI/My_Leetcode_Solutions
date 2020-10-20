package from_401_to_600.P530_二叉搜索树的最小绝对差;


import java.util.ArrayList;

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

    private ArrayList<TreeNode> searchResult;
    private int ans;

    private void inOrder(TreeNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        // 计算最小值
        if (!searchResult.isEmpty()){
            ans = Math.min(ans, Math.abs(node.val - searchResult.get(searchResult.size()-1).val));
        }
        searchResult.add(node);
        inOrder(node.right);
    }
    public int getMinimumDifference(TreeNode root) {
        // 二叉搜索树中序遍历的结果就是从小到大的排序
        searchResult = new ArrayList<>();
        ans = Integer.MAX_VALUE;
        inOrder(root);
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
