import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> set = new HashSet<>();
        
        for (String number : phone_book) {
            set.add(number);
        }
        
        for (String number : phone_book) {
            for (int i = 0; i < number.length(); i++) {
                String sub = number.substring(0, i);
                
                if (set.contains(sub)) {
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}