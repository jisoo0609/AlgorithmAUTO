import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int[] dx = {0, 0, -1, 1};  // 상 하 좌 우
    private static final int[] dy = {-1, 1, 0, 0};  // 상 하 좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // 미로 정보 입력받음
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
           String s = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = s.charAt(j) - '0';
            }
        }

        Queue<int[]> toVisit = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        // 시작 지점
        toVisit.add(new int[]{0, 0});
        visited[0][0] = true;

        // BFS
        while (!toVisit.isEmpty()) {
            int[] next = toVisit.poll();
            int nowY = next[0];
            int nowX = next[1];

            for (int i = 0; i < 4; i++) {
                int nextY = nowY + dy[i];
                int nextX = nowX + dx[i];

                if (0 <= nextY && nextY < n && 0 <= nextX && nextX < m &&
                        maze[nextY][nextX] == 1 &&
                        !visited[nextY][nextX]
                ) {
                    toVisit.add(new int[]{nextY, nextX});
                    maze[nextY][nextX] = maze[nowY][nowX] + 1;
                    visited[nextY][nextX] = true;
                }
            }
        }
        System.out.println(maze[n - 1][m - 1]);
    }
}
