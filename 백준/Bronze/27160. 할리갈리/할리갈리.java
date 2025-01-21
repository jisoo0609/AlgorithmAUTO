// 할리갈리
// https://www.acmicpc.net/problem/27160

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 카드의 개수 N
        int n = Integer.parseInt(br.readLine());

        // 카드의 정보
        Map<String, Integer> cards = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            if (cards.containsKey(input[0])) {
                cards.put(input[0], cards.get(input[0]) + Integer.parseInt(input[1]));
            } else {
                cards.put(input[0], Integer.parseInt(input[1]));
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("NO");
        for (String key : cards.keySet()) {
            if (cards.get(key) == 5) {
                sb = new StringBuilder();
                sb.append("YES");
            }
        }
        System.out.println(sb);
    }
}
