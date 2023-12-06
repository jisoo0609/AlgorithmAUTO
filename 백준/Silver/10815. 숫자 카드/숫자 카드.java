import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] hasNumberStr = br.readLine().split(" ");
        int[] hasNumbers = new int[N];
        for (int i = 0; i < N; i++) {
            hasNumbers[i] = Integer.parseInt(hasNumberStr[i]);
        }

        Arrays.sort(hasNumbers);

        int M = Integer.parseInt(br.readLine());
        String[] inCards = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int result = binarySearch(hasNumbers, Integer.parseInt(inCards[i]))
                    ? 1 : 0;
            sb.append(result)
                    .append(' ');
        }

        System.out.println(sb);
    }

    // 이진 탐색
    public boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}