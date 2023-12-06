import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static boolean isString(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            char next = line.charAt(i);

            if (next == '(' || next == '[') {
                stack.push(next);
            } else if (next == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (next == ']'){
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while(true) {
            line= br.readLine();

            if (line.equals(".")) break;

            if (isString(line)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}