import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static boolean isVPS(String line) {
        Stack<Character> vpsStack = new Stack<>();
        for (int i = 0; i <line.length(); i++) {
            char next = line.charAt(i);
            if (next == '(') {
                vpsStack.push(next);
            } else {
                if (vpsStack.isEmpty()) {
                    return false;
                } else {
                    vpsStack.pop();
                }
            }
        }
        return vpsStack.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            if (isVPS(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}