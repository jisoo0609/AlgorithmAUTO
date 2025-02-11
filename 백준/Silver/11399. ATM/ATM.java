import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        Arrays.sort(P); // 오름차순 정렬

        int total = 0;  // 총 대기 시간 합
        int sum = 0;    // 개별 대기 시간 누적 합

        for (int time : P) {
            sum += time; // 현재 사람이 돈을 인출하는 데 걸리는 시간
            total += sum; // 총 대기 시간에 더하기
        }

        System.out.println(total);
        sc.close();
    }
}
