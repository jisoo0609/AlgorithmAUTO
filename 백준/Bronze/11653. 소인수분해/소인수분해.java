import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());

        // 소인수분해한 결과 값 저장
        List<Integer> nums = new ArrayList<>();

        // 소인수 분해
        // n을 2부터 n까지 나누어떨어지는 가장 작은 수로 나눔
        // 나누어떨어지게 하는 수를 list에 저장하고
        // n을 i로 나눈 값으로 반복
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                nums.add(i);
                n /= i;
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}