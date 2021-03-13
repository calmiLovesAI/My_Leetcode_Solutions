package from_601_to_800.P705_设计哈希集合;


import java.util.Iterator;
import java.util.LinkedList;

/*
哈希函数：hash(x)=x mod base
 */
class MyHashSet {

    private static final int base = 769;
    private LinkedList[] data;

    /** Initialize your data structure here. */
    public MyHashSet() {
        data = new LinkedList[base];
        for (int i = 0; i < base; i++) {
            data[i] = new LinkedList<Integer>();
        }
    }

    private int hash(int x){
        return x % base;
    }

    public void add(int key) {
        int h = hash(key);
        Iterator<Integer> it = data[h].iterator();
        while (it.hasNext()){
            Integer e = it.next();
            if (e == key){
                return;
            }
        }
        data[h].add(key);
    }

    public void remove(int key) {
        int h = hash(key);
        Iterator<Integer> it = data[h].iterator();
        while (it.hasNext()){
            Integer e = it.next();
            if (e == key){
                data[h].remove(e);
                return;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int h = hash(key);
        Iterator<Integer> it = data[h].iterator();
        while (it.hasNext()){
            Integer e = it.next();
            if (e == key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */


public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // 返回 True
        myHashSet.contains(3); // 返回 False ，（未找到）
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // 返回 True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // 返回 False ，（已移除）
    }
}
