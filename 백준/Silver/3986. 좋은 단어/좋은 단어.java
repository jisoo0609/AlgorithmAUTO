import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 좋은 단어의 개수
        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            Stack<Character> stack = new Stack<>();

            char[] chars = word.toCharArray();

            for (char c : chars) {
                if (stack.isEmpty() || stack.peek() != c) {
                    stack.push(c);
                } else if (stack.peek() == c){
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}