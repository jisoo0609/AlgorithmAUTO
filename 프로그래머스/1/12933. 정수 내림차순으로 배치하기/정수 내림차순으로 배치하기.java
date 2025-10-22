import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < list.length; i++) {
            sb.append(list[i]);
        }
        answer = Long.parseLong(sb.reverse().toString());
        
        return answer;
    }
}