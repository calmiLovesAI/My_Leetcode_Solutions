package 剑指offer.P26_树的子结构;

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

    private boolean sameStructure(TreeNode A, TreeNode B){
        if(B == null){
            return true;
        }
        if (A == null){
            return false;
        }
        if (A.val != B.val){
            return false;
        }
        return sameStructure(A.left, B.left) && sameStructure(A.right, B.right);
    }


    public boolean isSubStructure(TreeNode A, TreeNode B) {
        // 判断B是不是A的子结构
        boolean ans = false;

        if (A != null && B != null){
            if (A.val == B.val){
                // 递归判断结构是否相同
                ans = sameStructure(A, B);

            }

            if (!ans){
                ans = isSubStructure(A.left, B) || isSubStructure(A.right, B);
            }
        }

        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
