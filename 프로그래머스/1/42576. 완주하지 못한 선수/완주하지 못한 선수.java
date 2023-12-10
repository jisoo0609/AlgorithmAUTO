import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder answer = new StringBuilder();

        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c)-1);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer.append(key);
            }
        }
        
        return answer.toString();
    }
}