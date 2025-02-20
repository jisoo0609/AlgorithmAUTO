import java.util.*;

public class Main {
    static final int MOD = 1000000000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        
        int[][] dp = new int[N + 1][K + 1];
        
        // 초기 조건: 0을 만드는 방법은 항상 1개 (모든 숫자를 0으로 선택)
        for (int j = 1; j <= K; j++) {
            dp[0][j] = 1;
        }
        
        // DP 테이블 채우기
        for (int j = 1; j <= K; j++) {
            for (int i = 0; i <= N; i++) {
                if (i == 0) dp[i][j] = 1; // 이미 초기화됨
                else dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % MOD;
            }
        }
        
        System.out.println(dp[N][K]);
    }
}
