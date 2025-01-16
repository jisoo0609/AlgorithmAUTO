// 기타 레슨
// https://www.acmicpc.net/problem/2343

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 총 강의의 개수 N
        int n = Integer.parseInt(st.nextToken());
        // 블루레이의 개수 M
        int m = Integer.parseInt(st.nextToken());

        // 강의의 길이
        int[] lectures = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < lectures.length; i++) {
            lectures[i] = Integer.parseInt(st.nextToken());
        }

        // 가능한 블루레이의 최대, 최소 길이
        int start = 0;
        int end = lectures[lectures.length - 1];
        for (int i = 0; i < n; i++) {
            start = Math.max(start, lectures[i]);
            end += lectures[i];
        }
        
        System.out.println(binarySearch(lectures, start, end, m));

    }

    private static int binarySearch(int[] arr, int start, int end, int m) {
        while (start <= end) {
            // 블루레이 사이즈
            int mid = (start + end) / 2;

            // 블루레이 개수
            int count = 1;
            // 블루레이 사이즈
            int size = 0;

            for (int i = 0; i < arr.length; i++) {
                if (size + arr[i] > mid) {
                    count++;
                    size = arr[i];
                } else {
                    size += arr[i];
                }
            }

            if (count <= m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // 최소 크기
        return start;
    }
}
