import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        // first (i) = commands[0][0]
        // end (j) = commands[0][1]
        // index (k) = commands[0][2]
        
        for (int i = 0; i < commands.length; i++) {
            int first = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2] - 1;

            // 배열 자름
            int[] slice = Arrays.copyOfRange(array, first-1, end);
            // 정렬
            Arrays.sort(slice);

            answer[i] = slice[index];
        }
        return answer;
    }
}