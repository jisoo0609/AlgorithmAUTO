import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        char[][] board = new char[n][m];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        int minPaint = Integer.MAX_VALUE;

        // 가능한 모든 8x8 체스판을 탐색
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                minPaint = Math.min(minPaint, countRecolor(board, i, j));
            }
        }

        System.out.println(minPaint);
    }

    // 주어진 (startX, startY)에서 시작하는 8x8 부분에서 다시 칠해야 하는 개수 계산
    public static int countRecolor(char[][] board, int startX, int startY) {
        int count1 = 0; // 'W' 시작 패턴
        int count2 = 0; // 'B' 시작 패턴

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expectedColor1 = ((i + j) % 2 == 0) ? 'W' : 'B'; // 'W'로 시작하는 체스판
                char expectedColor2 = ((i + j) % 2 == 0) ? 'B' : 'W'; // 'B'로 시작하는 체스판

                if (board[startX + i][startY + j] != expectedColor1) {
                    count1++;
                }
                if (board[startX + i][startY + j] != expectedColor2) {
                    count2++;
                }
            }
        }

        return Math.min(count1, count2);
    }
}