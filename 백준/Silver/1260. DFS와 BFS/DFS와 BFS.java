import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};

    // 정점의 개수
    static int N;
    // 간선의 개수
    static int M;
    // 탐색을 시작할 정점의 번호
    static int V;
    static int[][] adjMat;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        V = Integer.parseInt(input[2]);

        adjMat = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            // 간선의 정보를 받는다.
            String[] edgeInfo = br.readLine().split(" ");
            // 연결된 두 정점을 찾는다.
            int leftNode = Integer.parseInt(edgeInfo[0]);
            int rightNode = Integer.parseInt(edgeInfo[1]);
            // 인접 행렬에 인접했다고 기록한다.
            adjMat[leftNode][rightNode] = 1;
            adjMat[rightNode][leftNode] = 1;
        }

        dfs(N, V);
        System.out.println();
        bfs(N, V);
    }

    private static void dfs(int n, int v) {
        // 다음에 방문할 곳을 stack에 넣어줌
        Stack<Integer> toVisit = new Stack<>();
        // 방문 순서 기록
        List<Integer> visitOrder = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        // 탐색을 시작할 정점의 번호 stack에 push
        toVisit.push(v);

        while (!toVisit.isEmpty()) {
            int next = toVisit.pop();
            // 이미 방문한 정점이면 스킵
            if (visited[next]) continue;
            visited[next] = true;
            visitOrder.add(next);

            for (int i = n; i >= 0; i--) {
                if (adjMat[next][i] == 1 && !visited[i]) {
                    toVisit.push(i);
                }
            }
        }

        for (int num : visitOrder) {
            System.out.print(num +" ");
        }
    }

    private static void bfs(int n, int v) {
        Queue<Integer> toVisit = new LinkedList<>();
        List<Integer> visitOrder = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        toVisit.add(v);

        while (!toVisit.isEmpty()) {
            int next = toVisit.poll();
            if (visited[next]) continue;
            visited[next] = true;
            visitOrder.add(next);

            for (int i = 0; i <= n; i++) {
                if (adjMat[next][i] == 1 && !visited[i]) {
                    toVisit.add(i);
                }
            }
        }
        for (int num : visitOrder) {
            System.out.print(num +" ");
        }
    }
}