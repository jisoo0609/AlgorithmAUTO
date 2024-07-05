import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String infix = br.readLine();

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // 피연산자인 경우
            if ('A' <= ch && ch <= 'Z') {
                sb.append(ch);
            }
            // 연산자인 경우
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // 우선순위 비교
                // stack.peek의 우선순위가 push하려는 연산자의 우선순위보다 높은 경우
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(ch)) {
                    // stack의 연산자 pop -> 후위표기식에 추가
                    sb.append(stack.pop());
                }
                // 남은 연산자 push
                stack.push(ch);

            } // 괄호인 경우
            else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')'){
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); // '('를 제거
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    // 우선순위
    public static int priority(char operator) {
        if (operator == '+' || operator == '-')
            return 1;
        if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }
}
