// 수 찾기
// https://www.acmicpc.net/problem/1920

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        // 이진탐색
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
//            System.out.print(target + " ");
            if (binarySearch(arr, target) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        
        System.out.println(sb);

    }

    public static int binarySearch(int[] arr, int target) {
        // 처음 시작 위치
        int start = 0;
        // 끝 위치
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start+end) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
