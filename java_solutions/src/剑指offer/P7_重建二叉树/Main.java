package 剑指offer.P7_重建二叉树;


import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    private int[] pre;
    private int[] in;
    private HashMap<Integer, Integer> hashMap;


    public TreeNode recursion(int pl, int pr, int il, int ir){
        if(pl>pr||il>ir){
            return null;
        }
        TreeNode root = new TreeNode(pre[pl]);
        // 根节点所在的位置
        int k = hashMap.get(root.val);
        // 递归左子树
        TreeNode left = recursion(pl+1, pl+k-il, il, k-1);
        // 递归右子树
        TreeNode right = recursion(pl+k-il+1, pr, k+1, ir);
        root.left = left;
        root.right = right;
        // 返回后序遍历的结果
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre = preorder;
        in = inorder;
        hashMap = new HashMap<>();
        // 记录中序遍历中的元素位置信息
        for(int i = 0; i < in.length; i ++){
            hashMap.put(in[i], i);
        }
        return recursion(0, pre.length-1, 0, in.length-1);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
