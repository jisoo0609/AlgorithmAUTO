import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    static int[][] adjMat;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 컴퓨터의 수 (nodes)
        int nodes = Integer.parseInt(br.readLine());
        // 컴퓨터 쌍의 수 (edges)
        int edges = Integer.parseInt(br.readLine());

        adjMat = new int[nodes + 1][nodes + 1];
        for (int i = 0; i < edges; i++) {
            String[] edgeInfo = br.readLine().split(" ");
            int leftNode = Integer.parseInt(edgeInfo[0]);
            int rightNode = Integer.parseInt(edgeInfo[1]);

            adjMat[leftNode][rightNode] = 1;
            adjMat[rightNode][leftNode] = 1;
        }

        System.out.println(dfs(nodes));
    }

    // BFS
    private static int bfs(int n) {
        int count = 0;
        Queue<Integer> toVisit = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        // 시작 지점 1번 컴퓨터
        toVisit.add(1);

        while (!toVisit.isEmpty()) {
            int next = toVisit.poll();
            if (visited[next]) continue;
            visited[next] = true;
            count++;

            for (int i = 1; i <= n; i++) {
                if (adjMat[next][i] == 1 && !visited[i]) {
                    toVisit.add(i);
                }
            }
        }
        return count - 1; // 시작 컴퓨터는 제외
    }

    // DFS
    private static int dfs(int n) {
        int count = 0;
        Stack<Integer> toVisit = new Stack<>();
        boolean[] visited = new boolean[n + 1];

        // 시작지점 1번 컴퓨터
        toVisit.push(1);

        while (!toVisit.isEmpty()) {
            int next = toVisit.pop();
            if (visited[next]) continue;
            visited[next] = true;
            count++;

            for (int i = 1; i <= n; i++) {
                if (adjMat[next][i] == 1 && !visited[i]) {
                    toVisit.push(i);
                }
            }
        }
        return count - 1;
    }
}