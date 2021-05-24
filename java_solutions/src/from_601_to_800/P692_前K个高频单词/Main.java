package from_601_to_800.P692_前K个高频单词;


import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> cnt = new HashMap<>();
        for (String word : words){
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> rec = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : cnt.entrySet()){
            rec.add(entry.getKey());
        }

        rec.sort((o1, o2) -> cnt.get(o1).equals(cnt.get(o2)) ? o1.compareTo(o2) : cnt.get(o2) - cnt.get(o1));

        return rec.subList(0, k);
    }
}


public class Main {
    public static void main(String[] args) {

    }
}
