import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열의 개수 n, m
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Map<String, Integer> s = new HashMap<>();
        for (int i = 0; i < n; i++) {
            s.put(br.readLine(), 0);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (s.containsKey(str)) count++;
        }

        System.out.println(count);
    }
}