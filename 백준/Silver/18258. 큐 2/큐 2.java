import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 명령의 개수
        int n = Integer.parseInt(br.readLine());

        // Queue
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);

            switch (st.nextToken()) {
                case "push":
                    queue.offer(Integer.valueOf(st.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(queue.peekLast()).append("\n");
                    }
                break;
            }
        }
        System.out.println(sb);
    }
}