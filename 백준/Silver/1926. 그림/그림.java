import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // 시작 지점
    private static final int[] dx = {-1, 1, 0, 0};  // 좌 우 하 상
    private static final int[] dy = {0, 0, -1, 1};  // 좌 우 하 상
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        // 세로 크기
        int n = Integer.parseInt(input[0]);
        // 가로 크기
        int m = Integer.parseInt(input[1]);

        // 그림의 정보 입력받음
        int[][] info = new int[n][m];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                info[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 그림의 수
        int count = 0;
        // 넓이
        int max = 0;
       
        Queue<int[]> toVisit = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        // BFS
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                // 시작 지점이 0이거나 continue
                if (info[i][j] == 0 || visited[i][j]) continue;
                // 그림의 개수 증가
                count++;
                // 시작 지점
                toVisit.add(new int[]{i, j});
                // 해당 그림의 넓이
                int area = 0;

                while (!toVisit.isEmpty()) {
                    int[] next = toVisit.poll();
                    int nowY = next[0];
                    int nowX = next[1];
                    // 방문했으면 스킵
                    if (visited[nowY][nowX]) continue;
                    visited[nowY][nowX] = true;
                    area++;

                    for (int k = 0; k < 4; k++) {
                        int nextY = nowY + dy[k];
                        int nextX = nowX + dx[k];

                        if (0 <= nextY && nextY < n && 0 <= nextX && nextX < m &&
                                info[nextY][nextX] == 1 &&
                                !visited[nextY][nextX]
                        )
                            toVisit.add(new int[] {nextY, nextX});
                    }
                }
                max = Math.max(max, area);
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
}
