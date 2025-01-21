// 숨바꼭질
// https://www.acmicpc.net/problem/1697

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        // 수빈이가 있는 위치 N
        int n = Integer.parseInt(input[0]);
        // 동생이 있는 위치 K
        int k = Integer.parseInt(input[1]);

        System.out.println(BFS(n, k));
    }
    private static int BFS(int n, int k) {
        Queue<Integer> toVisit = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        // 걸린 시간
        int count = 0;

        toVisit.add(n);
        visited[n] = true;

        while (!toVisit.isEmpty()) {
            int size = toVisit.size(); // 큐의 크기 = 현재 레벨의 노드 수

            // 현재 레벨에서 모든 노드를 탐색
            for (int i = 0; i < size; i++) {
                int next = toVisit.poll();

                if (next == k) {
                    return count;  // 동생의 위치에 도달하면 그때의 시간이 바로 최단 시간
                }

                // x-1로 이동하는 경우
                if (next - 1 >= 0 && !visited[next - 1]) {
                    visited[next - 1] = true;
                    toVisit.add(next - 1);
                }
                // x+1로 이동하는 경우
                if (next + 1 <= 100000 && !visited[next + 1]) {
                    visited[next + 1] = true;
                    toVisit.add(next + 1);
                }
                // x*2로 이동하는 경우
                if (next * 2 <= 100000 && !visited[next * 2]) {
                    visited[next * 2] = true;
                    toVisit.add(next * 2);
                }
            }

            // 한 레벨을 모두 탐색한 후에 시간 증가
            count++;
        }
        return count;
    }
}
