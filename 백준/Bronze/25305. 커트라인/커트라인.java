import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        // 응시자의 수
        int n = Integer.parseInt(input[0]);
        // 상을 받는 사람의 수
        int k = Integer.parseInt(input[1]);

        // 점수 입력받음
        String[] inputScore = br.readLine().split(" ");
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(inputScore[i]);
        }

        // 점수 정렬
        Arrays.sort(score);

        System.out.println(score[score.length-k]);
    }
}