import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[1];
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        

        int[] score = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            String[] match = photo[i];
            int sum = 0;

           for (int j = 0; j < match.length; j++) {
               String person = match[j];
               if (map.containsKey(person)) {
                   sum += map.get(person);
               }
           }
            score[i] = sum;
        }

        return score;
    }
}