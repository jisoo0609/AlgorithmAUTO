import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        
        while (queue.size() > 1) {
            // 제일 위의 카드 버림
            queue.poll();
            // 그 다음 남은 카드를 밑으로 옮긴다
            queue.offer(queue.poll());
        }
        System.out.println(queue.peek());
    }
}