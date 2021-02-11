package from_601_to_800.P703_数据流中的第K大元素;

// 优先队列

import java.util.PriorityQueue;

class KthLargest {

    public int kVal;
    public PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        kVal = k;
        pq = new PriorityQueue<>();
        for (Integer e : nums){
            add(e);
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > kVal){
            pq.poll();
        }
        return pq.peek();

    }
}

public class Main {
    public static void main(String[] args) {
        KthLargest obj = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(obj.add(3));   // return 4
        System.out.println(obj.add(5));   // return 5
        System.out.println(obj.add(10));  // return 5
        System.out.println(obj.add(9));   // return 8
        System.out.println(obj.add(4));   // return 8

    }
}
