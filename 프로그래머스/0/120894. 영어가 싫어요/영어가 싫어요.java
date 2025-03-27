import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        HashMap<String, Integer> map = new HashMap<String, Integer>() {{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};
        
        for (String key : map.keySet()) {
            String value = String.valueOf(map.get(key));
            numbers = numbers.replace(key, value);
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}