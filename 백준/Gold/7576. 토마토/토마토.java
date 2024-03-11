import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // 상자의 가로 칸 수
    private static int n;
    // 상자의 세로 칸 수
    private static int m;
    private static int[][] tomato;
    private static int days;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};
    private static Queue<int[]> toVisit = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        m = Integer.parseInt(input[0]);
        n = Integer.parseInt(input[1]);

        tomato = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                // 익은 토마토가 있는 지역을 queue에 넣어줌 (시작지점)
                if (tomato[i][j] == 1)
                    toVisit.add(new int[]{i, j});
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        while(!toVisit.isEmpty()) {
            int[] next = toVisit.poll();
            int nowX = next[0];
            int nowY = next[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (0 <= nextX && nextX < n && 0 <= nextY && nextY < m &&
                    tomato[nextX][nextY] == 0
                ) {
                    toVisit.add(new int[]{nextX, nextY});
                    tomato[nextX][nextY] = tomato[nowX][nowY] + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomato[i][j] == 0) {
                    return -1;
                }
                days = Math.max(days, tomato[i][j]);
            }
        }

        if (days == 1) {
            return 0;
        } else {
            return days - 1;
        }
    }
}