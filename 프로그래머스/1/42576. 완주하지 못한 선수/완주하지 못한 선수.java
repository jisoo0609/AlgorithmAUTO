import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        // 1. map에 참여자 기록
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 2. 완주자 기록 -> 완주한 경우 -1
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        String answer = "";
        // 3. map에서 Value값이 0이 아닌 사람 기록
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer += key;
            }
        }
        
        return answer;
    }
}