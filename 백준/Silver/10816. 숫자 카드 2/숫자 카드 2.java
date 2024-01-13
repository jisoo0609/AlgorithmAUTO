import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // key = 입력되는 원소, value = 수가 등장한 횟수
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(input[i]);

            if (map.containsKey(key)) {
                map.replace(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(input[i]);
            if (map.containsKey(key)) {
                sb.append(map.get(key));
            } else {
                sb.append(0);
            }
            if (i < m - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}