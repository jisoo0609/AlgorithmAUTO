// 선분 위의 점
// https://www.acmicpc.net/problem/11663

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 점의 개수 N
        int n = Integer.parseInt(st.nextToken());
        // 선분의 개수 M
        int m = Integer.parseInt(st.nextToken());

        // 점의 좌표
        int[] points = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < points.length; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(points);

        // 선분의 시작점과 끝점
        int[][] lines = new int[m][2];
        for (int i = 0; i < lines.length; i++) {
            st = new StringTokenizer(br.readLine());
            lines[i][0] = Integer.parseInt(st.nextToken());
            lines[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0];
            int end = lines[i][1];

            // 이진 탐색을 이용해 범위 내 점 개수 계산
            int count = upperBound(points, end) - lowerBound(points, start);

            System.out.println(count);
        }
    }

    // 시작 값 이상이 처음 나오는 위치
    private static int lowerBound(int[] arr, int start) {
        // mid index 값
        int low = 0; int high = arr.length;

        while(low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= start) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // 종료 값 초과가 처음 나오는 위치
    private static int upperBound(int[] arr, int end) {
        int low = 0; int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > end) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
