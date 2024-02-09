class Solution {
    public String solution(String s) {
        int[] alp = new int[26];


        for (int i = 0; i < s.length(); i++) {
            alp[s.charAt(i) - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < alp.length; i++) {
            if (alp[i] == 1) {
                char ch = (char) (i + 'a');
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}