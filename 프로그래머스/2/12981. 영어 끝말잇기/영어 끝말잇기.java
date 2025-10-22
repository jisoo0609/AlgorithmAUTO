import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        Set<String> set = new HashSet<>();

        char lastChar = words[0].charAt(0); // 초기값
        for (int i = 0 ; i < words.length; i++) {
            // 1. 단어 제대로 연결되었는지 확인 
            // 이전단어의 end == 뒤의 단어의 start
            String current = words[i];
            
            if (i > 0) {    // i = 1부터
                char preLastChar = words[i - 1].charAt(words[i - 1].length() -1);   // 이전 단어의 end
                char currentFirstChar = current.charAt(0);
                
                if (preLastChar != currentFirstChar) {  // 끝말잇  기 끝
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    return answer;
                }
                
            }
            
            // 2. 중복단어
            if (!set.contains(current)) {
                set.add(current);
            } else {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
        }
        
        // 반복문 전부 통과한 경우 탈락자 X
        return answer;
    }
}