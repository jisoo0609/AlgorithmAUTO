import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        boolean[] isPrime = new boolean[m + 1];

        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i*i < isPrime.length; i++) {
            if (isPrime[i]) continue;
            for (int j = i*i; j < isPrime.length; j += i) {
                isPrime[j] = true;
            }
        }

        for (int i = n; i <= m; i++) {
            if (!isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
