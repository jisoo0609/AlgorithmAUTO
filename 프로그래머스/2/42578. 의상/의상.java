import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, List<String>> hashMap = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            List<String> list = new ArrayList<>();
            String key = clothes[i][1];
            String value = clothes[i][0];
            
            if (!hashMap.containsKey(key)) {
                list.add(value);
                hashMap.put(key, list);
            } else {
                hashMap.get(key).add(value);
            }
        }
        
        for (String key : hashMap.keySet()) {
            answer *= hashMap.get(key).size()+1;
        }
        
        return answer - 1;
    }
}