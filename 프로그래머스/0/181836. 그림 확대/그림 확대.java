import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();
        
        // 세로 확대: 각 문자열에서 각 문자를 k번 반복
        // 가로 확대: 각 문자열을 k번 반복하여 새로운 줄로 추가
        for (String row : picture) {
            StringBuilder sb = new StringBuilder();

            // 가로 확대
            for (int i = 0; i < row.length(); i++) {
                char c = row.charAt(i);
                for (int j = 0; j < k; j++) {
                    sb.append(c);
                }
            }
        
            // 세로 확대
            String expend = sb.toString();
            for (int i = 0; i < k; i++) {
                result.add(expend);
            }
        }
        
        String[] answer = new String[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}