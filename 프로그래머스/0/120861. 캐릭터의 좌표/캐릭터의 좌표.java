class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        /** 
        O = [0, 0]
        up = [0, 1]
        donw = [0, -1]
        left = [-1, 0]
        right = [1, 0]
        */
        
        // 맵의 중앙을 기준으로 범위 설정
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                if (answer[1] < maxY) {
                    answer[1] = answer[1] + 1;
                }
            } else if (keyinput[i].equals("down")) {
                if (answer[1] > -maxY) {
                    answer[1] = answer[1] - 1;
                }
            } else if (keyinput[i].equals("left")) {
                if (answer[0] > -maxX) {
                    answer[0] = answer[0] - 1;
                }
            } else if (keyinput[i].equals("right")) {
                if (answer[0] < maxX) {
                    answer[0] = answer[0] + 1;
                }
            }
        }
                
        return answer;
    }
}