package from_1_to_200.P173_二叉搜索树迭代器;


import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class BSTIterator {
    private TreeNode cur;
    private final LinkedList<TreeNode> linkedList;

    public BSTIterator(TreeNode root) {
        this.cur = root;
        linkedList = new LinkedList<>();
    }

    public int next() {
        while (cur != null){
            linkedList.addLast(cur);
            cur = cur.left;
        }
        cur = linkedList.removeLast();
        int ret = cur.val;
        cur = cur.right;
        return ret;
    }

    public boolean hasNext() {
        return cur != null || !linkedList.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */


public class Main {
    public static void main(String[] args) {

    }
}
