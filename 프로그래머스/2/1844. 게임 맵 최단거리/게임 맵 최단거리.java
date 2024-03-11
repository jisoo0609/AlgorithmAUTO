import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static final int[] dx = {0, 0, -1, 1};  // 상 하 좌 우
    private static final int[] dy = {-1, 1, 0, 0};  // 상 하 좌 우

    public int solution(int[][] maps) {
        Queue<int[]> toVisit = new LinkedList<>();
        int rows = maps.length;
        int cols = maps[0].length;
        boolean[][] visited = new boolean[rows][cols];

        // 시작 지점
        toVisit.add(new int[]{0, 0, 0});
        visited[0][0] = true;

        // BFS
        while (!toVisit.isEmpty()) {
            int[] next = toVisit.poll();
            int nowY = next[0];
            int nowX = next[1];

            for (int i = 0; i < 4; i++) {
               int nextY = nowY + dy[i];
               int nextX = nowX + dx[i];

               if (0 <= nextY && nextY < rows && 0 <= nextX && nextX < cols &&
                    maps[nextY][nextX] == 1 &&
                       ! visited[nextY][nextX]
               ) {
                   toVisit.add(new int[]{nextY, nextX});
                   maps[nextY][nextX] = maps[nowY][nowX] + 1;
                   visited[nextY][nextX] = true;
               }
            }
        }

        if (maps[rows - 1][cols -1] == 1) {
            return -1;
        }
        return maps[rows - 1][cols -1];
    }
}