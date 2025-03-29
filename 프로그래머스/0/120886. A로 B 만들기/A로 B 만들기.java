import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        int[] beforeAlp = new int[26];
        int[] afterAlp = new int[26];
        
        for (int i = 0; i < before.length(); i++) {
            beforeAlp[before.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < after.length(); i++) {
            afterAlp[after.charAt(i) - 'a']++;
        }
        
        if (Arrays.equals(beforeAlp, afterAlp)) {
            answer = 1;
        }
        
        return answer;
    }
}