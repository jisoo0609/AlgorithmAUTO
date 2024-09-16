import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        // 동전의 가치
        int[] values = new int[n];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = n -1; i >= 0; i--) {
            // 동전의 가치가 k보다 작아야 사용 가능
            if (values[i] <= k) {
                // 개수
                count = count + (k / values[i]);
                // 나머지
                k = k % values[i];
            }
        }
        System.out.println(count);
    }
}