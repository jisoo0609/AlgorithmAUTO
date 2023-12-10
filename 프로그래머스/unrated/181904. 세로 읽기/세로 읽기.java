class Solution {
    public String solution(String my_string, int m, int c) {
        String answer ="";
        char[][] words = new char[my_string.length()/m][m];

        int idx = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < m; j++) {
                words[i][j] = my_string.charAt(idx++);

                if (j == c-1) {
                    answer += words[i][j];
                }
            }
        }

        return answer;
    }
}