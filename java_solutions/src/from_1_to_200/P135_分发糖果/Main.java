package from_1_to_200.P135_分发糖果;

/*
贪心算法（又称贪婪算法）是指，在对问题求解时，总是做出在当前看来是最好的选择。
也就是说，不从整体最优上加以考虑，他所做出的是在某种意义上的局部最优解。
贪心算法不是对所有问题都能得到整体最优解，关键是贪心策略的选择，
选择的贪心策略必须具备无后效性，即某个状态以前的过程不会影响以后的状态，只与当前状态有关。
 */


class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int ans = 1;     // 最少分配一个糖果
        // inc : 最近的递增序列的长度，dec : 当前递减序列的长度，pre : 前一个同学分得的糖果数量
        int inc = 1, dec = 0, pre = 1;
        for (int i = 1; i < n; i++) {
            if (ratings[i] >= ratings[i-1]){
                // 在最近的递增序列中，直接分配给该同学pre+1个糖果即可。
                dec = 0;
                pre = ratings[i] == ratings[i-1]?1:pre+1;
                ans += pre;
                inc = pre;
            }else{
                dec++;
                // 注意当当前的递减序列长度和上一个递增序列等长时，需要把最近的递增序列的最后一个同学也并进递减序列中
                if (dec == inc){
                    dec++;
                }
                ans += dec;
                pre = 1;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().candy(new int[]{1,3,2,2,1}));
    }
}
