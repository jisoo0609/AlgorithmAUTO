class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        
        int row = arr.length;
        int col = arr[0].length;
        
        if (row > col) {
            answer = new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        else if (row < col) {
            answer = new int[col][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        else {
            return arr;
        }
        
        return answer;
    }
}