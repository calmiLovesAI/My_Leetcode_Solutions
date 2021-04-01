package from_201_to_400.P217_存在重复元素;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int e : nums){
            if (hashSet.contains(e)){
                return true;
            }else{
                hashSet.add(e);
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
