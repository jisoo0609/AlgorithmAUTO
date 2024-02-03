import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 학생 이니셜, 학번의 Queue 생성
        Queue<String> names = new LinkedList<>();
        Queue<Integer> numbers = new LinkedList<>();

        // 학생 이니셜, 학번 입력받아 큐에 저장
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            names.offer(str[0]);
            numbers.offer(Integer.parseInt(str[1]));
        }

        while(names.size() > 1 && numbers.size() > 1) {
            // 처음
            names.poll();
            int number = numbers.poll();

            for (int i = 0; i < number - 1; i++) {
                names.offer(names.poll());
                numbers.offer(numbers.poll());
            }
            names.poll();
            numbers.poll();
        }

        System.out.println(names.poll());
    }
}