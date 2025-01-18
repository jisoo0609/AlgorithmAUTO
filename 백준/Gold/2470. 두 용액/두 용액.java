// 두 용액
// https://www.acmicpc.net/problem/2470

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 용액의 수 N
        int n = Integer.parseInt(br.readLine());

        // 용액
        int [] liquids = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            liquids[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(liquids);

        // 투 포인터
        int left = 0;
        int right = liquids.length - 1;

        // 최소값
        int min = Integer.MAX_VALUE;

        // 결과
        int resultLeft = 0;
        int resultRight = 0;

        while (left < right) {
            int sum = liquids[left] + liquids[right];

            if (Math.abs(sum) < Math.abs(min)) {
                min = sum;
                resultLeft = liquids[left];
                resultRight = liquids[right];
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(resultLeft + " " + resultRight);
    }
}
