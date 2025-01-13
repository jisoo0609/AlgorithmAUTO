// 암기왕
// https://www.acmicpc.net/problem/2776

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 테스트 케이스의 개수 T
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // 수첩 1에 적어놓은 정수의 개수 N
            int n = Integer.parseInt(br.readLine());
            // 수첩 1에 적혀있는 정수들
            Set<Integer> set = new HashSet<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                set.add(Integer.parseInt(st.nextToken()));
            }

            // 수첩 2에 적어놓은 정수의 개수 M
            int m = Integer.parseInt(br.readLine());
            // 수첩2에 적혀있는 정수들
            int[] list2 = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < list2.length; i++) {
                list2[i] = Integer.parseInt(st.nextToken());
            }

            // 출력
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list2.length; i++) {
                if (set.contains(list2[i])) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            System.out.print(sb.toString());
        }
    }
}
