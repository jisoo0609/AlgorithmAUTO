import java.util.HashMap;

class Solution {
    public int solution(String s) {
        HashMap<String, Integer> words = new HashMap<>();
        words.put("zero", 0);
        words.put("one", 1);
        words.put("two", 2);
        words.put("three", 3);
        words.put("four", 4);
        words.put("five", 5);
        words.put("six", 6);
        words.put("seven", 7);
        words.put("eight", 8);
        words.put("nine", 9);
        
        StringBuilder result = new StringBuilder();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                result.append(s.charAt(i));
            } else {
                text.append(s.charAt(i));
                
                if (words.containsKey(text.toString())) {
                    result.append(words.get(text.toString()));
                    text.delete(0, text.length());
                }
            }
        }
        return Integer.parseInt(result.toString());
    }
}