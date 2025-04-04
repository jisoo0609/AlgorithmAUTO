class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int start = 1;
        int x = 0; int y = 0;
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        boolean[][] visited = new boolean[n][n];

        int direction = 0;
        
        while(start <= n*n) {
            answer[x][y] = start;
            start++;
            
            int nextX = x + dx[direction];
            int nextY = y + dy[direction];
                
            if (0 <= nextX && nextX < n && 0 <=nextY && nextY < n && answer[nextX][nextY] == 0) {
                x = nextX;
                y = nextY;
            } else {
                direction = (direction + 1) % 4;
                x = x + dx[direction];
                y = y + dy[direction];
            }
        }
        
        return answer;
    }
}