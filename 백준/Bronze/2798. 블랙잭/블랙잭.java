import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] cardsInput = br.readLine().split(" ");
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(cardsInput[i]);
        }

        int sum = 0;
        int temp = 0;
        for (int i = 0; i < n -2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    temp = cards[i] + cards[j] + cards[k];

                    if (sum < temp && temp <= m) {
                        sum = temp;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}