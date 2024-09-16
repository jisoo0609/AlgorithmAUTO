import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 거스름돈 액수
        int n = Integer.parseInt(br.readLine());

        // 거슬러 줄 수 없는 경우
        // 2, 5원으로만 거슬러 주기 가능 -> 액수 1원, 3원인경우 거스름돈 불가
        if (n == 1 || n == 3) {
            System.out.println(-1);
        }

        // 5원으로 거슬러준 후 거스름돈이 짝수가 남은 경우
        else if((n % 5) % 2 == 0) {
            // 5원 거스름돈 개수
            int fives = n / 5;
            // 2원 개수
            int twos = (n % 5) / 2;
            System.out.println(fives + twos);
        }

        // 5원으로 거슬러준 후 거스름돈이 홀수가 남은 경우
        else if ((n % 5) % 2 == 1) {
            int fives = n / 5 - 1;
            int twos = ((n % 5) + 5) / 2;
            System.out.println(fives + twos);
        }
    }
}
