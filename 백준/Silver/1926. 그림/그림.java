import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // 시작 지점
    private static final int[] dx = {0, 0, -1, 1};  // 상 하 좌 우
    private static final int[] dy = {-1, 1, 0, 0};  // 상 하 좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // 그림 입력받음
        int[][] picture = new int[n][m];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                picture[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 그림의 수
        int count = 0;

        // 가장 넓은 그림의 넓이
        int max = 0;

        // BFS
        Queue<int[]> toVisit = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 시작 지점이 0이거나 방문한 지점이면 continue
                if (picture[i][j] == 0 || visited[i][j]) continue;

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

                    // 방믄한 경우 스킵
                    if (visited[nowY][nowX]) continue;
                    visited[nowY][nowX] = true;
                    area++;

                    for (int k = 0; k < 4; k++) {
                        int nextY = nowY + dy[k];
                        int nextX = nowX + dx[k];

                        if (0 <= nextY && nextY < n && 0 <= nextX && nextX < m &&
                            picture[nextY][nextX] == 1 &&
                            !visited[nextY][nextX])
                        {
                            toVisit.add(new int[]{nextY, nextX});
                        }
                    }
                }
                max = Math.max(max, area);
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
}