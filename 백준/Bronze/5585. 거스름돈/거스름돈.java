import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 지불한 돈 1000엔 지폐
        // 내야할 금액: 1000 - 입력값
        int price = 1000 - Integer.parseInt(br.readLine());
        // 잡화점이 가진 잔돈
        int[] values = {500, 100, 50, 10, 5, 1};

        // 거스름돈 매수
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] <= price) {
                count = count + (price / values[i]);
                price = price % values[i];
            }
        }
        System.out.println(count);
    }
}
