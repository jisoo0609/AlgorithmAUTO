import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        // (length, count)
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (String str : strArr) {
            int length = str.length();
            int count = 0;
        
            if (map.containsKey(length)) {
                count = map.get(length);
            } else {
                count = 0;
            }
            
            map.put(length, count+1); 
        }
        
        int max = 0;
        for (int count : map.values()) {
            max = Math.max(max, count);
        }
    
        return max;
    }
}