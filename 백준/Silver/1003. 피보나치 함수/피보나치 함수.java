import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        // 최대 40까지의 피보나치 수를 저장할 dp 배열
        int[][] dp = new int[41][2];
        
        // 기본 값 초기화
        dp[0][0] = 1; dp[0][1] = 0; // fibonacci(0)
        dp[1][0] = 0; dp[1][1] = 1; // fibonacci(1)

        // DP를 이용해 피보나치 수 계산
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0]; // 0의 출력 횟수
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1]; // 1의 출력 횟수
        }

        // 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }

        sc.close();
    }
}
