import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 개수
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int total = 0;
            int score = 0;

            String quiz = br.readLine();

            for (int j = 0; j < quiz.length(); j++) {
                if (quiz.charAt(j) == 'O') {
                    score++;
                    total += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(total);
        }
    }
}
