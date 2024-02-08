import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");

        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        for (String s : str) {
            leftStack.push(s);
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            if (input[0].equals("L") && !leftStack.isEmpty()) {
                rightStack.push(leftStack.pop());
            }
            else if (input[0].equals("D") && !rightStack.isEmpty()) {
                leftStack.push(rightStack.pop());
            }
            else if (input[0].equals("B") && !leftStack.isEmpty()) {
                leftStack.pop();
            }
            else if (input[0].equals("P")) {
                leftStack.push(input[1]);
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
    }
}
