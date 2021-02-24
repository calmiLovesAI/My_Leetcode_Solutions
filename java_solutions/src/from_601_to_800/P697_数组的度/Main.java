package from_601_to_800.P697_数组的度;


import java.util.HashMap;
import java.util.Map;

/*
每一个数映射到一个长度为3的数组，数组中的三个元素分别代表这个数出现的次数、
这个数在原数组中第一次出现的位置和这个数在原数组中最后一次出现的位置。
当我们记录完所有信息后，我们需要遍历该哈希表，找到元素出现次数最多，且前后位置差最小的数。
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> hashMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], new int[]{1, i, i});
            }else{
                hashMap.get(nums[i])[0]++;
                hashMap.get(nums[i])[2] = i;
            }
        }

        int maxNum = 0, minLen = 0;
        for (Map.Entry<Integer, int[]> entry : hashMap.entrySet()){
            int[] arr = entry.getValue();
            if (maxNum < arr[0]){
                maxNum = arr[0];
                minLen = arr[2] - arr[1] + 1;
            }else if (maxNum == arr[0]){
                minLen = Math.min(minLen, arr[2] - arr[1] + 1);
            }

        }
        return minLen;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }
}
