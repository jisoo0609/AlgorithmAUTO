import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 C
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            // n명의 점수
            String[] input = br.readLine().split(" ");

            int n = Integer.parseInt(input[0]);
            int[] score = new int[n];

            int sum = 0;
            // 점수 입력받음
            for (int j = 0; j < score.length; j++) {
                score[j] = Integer.parseInt(input[j+1]);
                sum += score[j];
            }
            // 평균
            double avg = (double) sum / n;
            // 평균 점수를 넘는 학생의 수
            int count = 0;
            for (int j = 0; j < score.length; j++) {
                if (score[j] > avg) {
                    count++;
                }
            }
            // 평균 넘는 학생의 비율
            double ratio = (double) count / n *100;
            System.out.println(String.format("%.3f%%", ratio));
        }
    }
}
