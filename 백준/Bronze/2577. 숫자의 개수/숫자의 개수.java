import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        long result = (long) a * b * c;
        String resultStr = Long.toString(result);

        // 0부터 9까지의 숫자
        int[] numbers = new int[10];

        for (int i = 0; i < resultStr.length(); i++) {
            int n = Integer.parseInt(String.valueOf(resultStr.charAt(i)));
            numbers[n]++;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
