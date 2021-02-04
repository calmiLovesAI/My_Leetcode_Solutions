package from_601_to_800.P606_根据二叉树创建字符串;

import java.util.HashSet;
import java.util.Set;

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

// 递归
class Solution {

    public String tree2str(TreeNode t) {
        if (t == null){
            return "";
        }
        if (t.left == null && t.right == null){
            return t.val+"";
        }
        if (t.right == null){
            return t.val + "(" + tree2str(t.left) + ")";
        }
        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
    }

}


public class Main {
    public static void main(String[] args) {

    }
}
