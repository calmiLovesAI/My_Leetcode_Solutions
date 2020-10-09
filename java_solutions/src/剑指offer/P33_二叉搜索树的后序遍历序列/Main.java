package 剑指offer.P33_二叉搜索树的后序遍历序列;




class Solution {

    private int[] post;

    private boolean dfs(int i, int j){
        // i , j 分别为左右边界
        if (i >= j){
            return true;
        }
        int root = post[j];
        int k = i;
        while (k < j && post[k] < root){
            k++;
        }
        for (int t = k; t < j;t++){
            if (post[t] < root){
                return false;
            }
        }
        return dfs(i, k-1) && dfs(k, j-1);
    }

    public boolean verifyPostorder(int[] postorder) {
        post = postorder;
        return dfs(0, post.length-1);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.verifyPostorder(new int[]{1, 3, 2, 6, 5}));
    }
}
