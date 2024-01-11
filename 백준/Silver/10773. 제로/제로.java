import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 횟수
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input != 0) {
                stack.push(input);
            } else {
                // 0이 불리면 최근의 수를 지움
                stack.pop();
            }
        }

        // 마지막에 스택에 남아있는 원소의 합
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        System.out.println(sum);
    }
}