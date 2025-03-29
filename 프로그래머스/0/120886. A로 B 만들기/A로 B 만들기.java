import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        if (Arrays.equals(beforeArr, afterArr)) {
            answer = 1;
        }
        
        return answer;
    }
}