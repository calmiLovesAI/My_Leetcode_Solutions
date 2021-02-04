package from_1_to_200.P66_加一;


import java.util.Arrays;

//  递归，当最末尾一个数是9的时候，需要进位
class Solution {

    public boolean flag;

    public int[] plusOne(int[] digits) {
        flag = false;
        dfs(digits, digits.length-1);
        System.out.println(flag);
        if (!flag){
           return digits;
        }else{
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            return ans;
        }
    }


    public void dfs(int[] arr, int k){
        if (arr[k] == 9){
            arr[k] = 0;
            if (k == 0){
                flag = true;
                return;
            }
            dfs(arr, k-1);
        }else{
            arr[k]++;
        }

    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9, 9, 9})));
    }
}
