import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 명령의 개수
        int n = Integer.parseInt(br.readLine());

        // Stack
        Stack <Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);

            switch (st.nextToken()) {
                case "1":
                    stack.push(Integer.valueOf(st.nextToken()));
                    break;
                case "2":
                    if (stack.isEmpty()) {
                       sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    if (stack.isEmpty()) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "5":
                   if (stack.isEmpty()) {
                       sb.append("-1").append("\n");
                   } else {
                       sb.append(stack.peek()).append("\n");
                   }
                   break;
            }
        }
        System.out.println(sb);
    }
}