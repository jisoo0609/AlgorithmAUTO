class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int digit = c - '0';
            answer[str.length() - i - 1] = digit;
        }
        
        return answer;
    }
}