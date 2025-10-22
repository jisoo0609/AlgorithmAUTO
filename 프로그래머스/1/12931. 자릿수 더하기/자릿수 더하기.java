import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int digit = c - '0';
            answer += digit;
        }  
        
        return answer;
    }
}