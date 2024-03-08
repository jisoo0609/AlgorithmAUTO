import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] cardsInput = br.readLine().split(" ");
        long[] cards = Arrays.stream(cardsInput)
                .mapToLong(Long::parseLong)
                .toArray();

        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            priorityQueue.offer(cards[i]);
        }

        for (int i = 0; i < m; i++) {
            long first = priorityQueue.poll();
            long second = priorityQueue.poll();

            long sum = first + second;

            priorityQueue.offer(sum);
            priorityQueue.offer(sum);
        }

        long total = 0;
        while (!priorityQueue.isEmpty()) {
            total += priorityQueue.poll();
        }
        System.out.println(total);
    }
}