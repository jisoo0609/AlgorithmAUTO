import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 피연산자의 개수
        int n = Integer.parseInt(br.readLine());
        // 피연산자
        int[] operand = new int[n];
        // 후위 표기식
        String postfix = br.readLine();

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            operand[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            // 후위표기식이 대문자인 경우 피연산자
            if ('A' <= ch && ch <= 'Z') {
                // 스택에 값 추가
                double value = operand[ch - 'A'];
                stack.push(value);
            }
            // 연산자인 경우
            else {
                // 스택이 비어있지 않아야 함
                if (!stack.isEmpty()) {
                    // 먼저 나온 것이 뒤에 위치
                    double second = stack.pop();
                    double first = stack.pop();

                    switch (ch) {
                        case '+':
                            stack.push(first + second);
                            continue;

                        case '-':
                            stack.push(first - second);
                            continue;

                        case '*':
                            stack.push(first * second);
                            continue;

                        case '/':
                            stack.push(first / second);
                            continue;
                    }
                }
            }
        }

        System.out.println(String.format("%.2f", stack.pop()));
    }
}