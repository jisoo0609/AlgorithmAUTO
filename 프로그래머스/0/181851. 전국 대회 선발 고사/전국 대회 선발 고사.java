import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // idx, rank
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(i, rank[i]);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue()); 
        
        int a = list.get(0).getKey();
        int b = list.get(1).getKey();
        int c = list.get(2).getKey();

        return 10000 * a + 100 * b + c;
    }
}