// 빙산
// https://www.acmicpc.net/problem/2573

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n;
    static int m;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        // 행의 개수 N
        n = Integer.parseInt(input[0]);
        // 열의 개수 M
        m = Integer.parseInt(input[1]);

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int year = 0;
        while (true) {
            int iceCount = countIce(n, m);

            if (iceCount == 0) {  // 빙산이 완전히 녹은 경우
                year = 0;
                System.out.println(year);
                break;
            }

            if (iceCount >= 2) {    // 빙산이 2개 이상 분리되는 경우
                System.out.println(year);
                break;
            }

            meltIce(n, m);
            year++;
        }
    }

    // 빙산 덩어리 수
    private static int countIce(int n, int m) {
        boolean[][] visited = new boolean[n][m];
        // 빙산 덩어리 수
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] != 0 && !visited[i][j]) {
                    dfs(i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }


    // 빙산 상태 업데이트 (빙산 녹이기)
    private static void meltIce(int n, int m) {
        int[][] melt = new int[n][m];

        // 인접한 바다의 개수 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] > 0) {
                    int waterCount = 0;

                    for (int k = 0; k < 4; k++) {
                        int nextX = i + dx[k];
                        int nextY = j + dy[k];

                        if (checkBounds(nextX, nextY) && map[nextX][nextY] == 0) {
                            waterCount++;
                        }
                    }
                    melt[i][j] = Math.max(0, map[i][j] - waterCount);
                }
            }
        }
        map = melt;
    }

    private static void dfs(int x, int y, boolean[][] visited) {
        Stack<int[]> toVisit = new Stack<>();
        toVisit.push(new int[]{x, y});
        visited[x][y] = true;

        while (!toVisit.isEmpty()) {
            int[] cur = toVisit.pop();

            for (int i = 0; i < 4; i++) {
                int nextX = cur[0] + dx[i];
                int nextY = cur[1] + dy[i];

                if (checkBounds(nextX, nextY) && map[nextX][nextY] > 0 && !visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    toVisit.push(new int[]{nextX, nextY});
                }
            }
        }
    }

    private static boolean checkBounds(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}
