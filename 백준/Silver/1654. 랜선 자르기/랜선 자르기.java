// 랜선 자르기
// https://www.acmicpc.net/problem/1654

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        // 이미 가지고 있는 랜선의 개수 K
        int k = Integer.parseInt(input[0]);
        // 필요한 랜선의 개수 N
        int n = Integer.parseInt(input[1]);

        // 이미 가지고 있는 각 랜선의 길이
        int[] lanLength = new int[k];
        for (int i = 0; i < lanLength.length; i++) {
            lanLength[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lanLength);

        long result = binarySearch(lanLength, k, n);
        System.out.println(result);
    }

    // 이분 탐색
    public static long binarySearch(int[] arr, int k, int n) {
        // 랜선의 길이 최댓값
        long start = 1; // 0인 경우 mid -> 0
        long end = arr[k-1];

        // 이분탐색
        while (start <= end) {
            // 랜선의 개수
            long count = 0;
            long mid = (start + end) / 2;

            for (int i = 0; i < k; i++) {
                count += arr[i] / mid;
            }
            if (count < n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        // start가 end와 같을 때 end가 우리가 찾은 최대 길이가 되어야 함
        return end;
    }
}
