class Solution {
    public int[] solution(int[][] score) {
        // 1. 평균을 구함
        int[] avgArr = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            int engScore = score[i][0];
            int mathScore = score[i][1];
            
            int avg = engScore + mathScore;
            
            avgArr[i] = avg; 
        }
        
        // 2. 구한 평균으로 등수를 매김
        int[] answer = new int[avgArr.length];
        
        for (int i = 0; i < answer.length; i++) {
            int idx = 1;
            for (int j = 0; j < answer.length; j++) {
                if (avgArr[i] < avgArr[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }
        
        
        // 3. 등수 출력
        return answer;
    }
}