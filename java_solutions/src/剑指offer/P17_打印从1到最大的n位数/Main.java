package 剑指offer.P17_打印从1到最大的n位数;

import java.util.ArrayList;

class Solution {
    public int[] printNumbers(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int bound = 0;
        while (n > 0){
            bound = (bound) * 10 + 9;
            n--;
        }
        for(int i = 1; i <= bound; i++){
            arrayList.add(i);
        }
        return arrayList.stream().mapToInt(Integer::valueOf).toArray();
    }
}




public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}
