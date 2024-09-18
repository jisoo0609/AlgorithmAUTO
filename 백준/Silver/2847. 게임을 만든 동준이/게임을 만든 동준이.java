import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 레벨의 수
        int n = Integer.parseInt(br.readLine());
        // 점수
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for (int i = n-1; i > 0; i--) {
            while (scores[i-1] >= scores[i]) {
                scores[i-1]--;
                count++;
            }
        }
        System.out.println(count);
    }
}
