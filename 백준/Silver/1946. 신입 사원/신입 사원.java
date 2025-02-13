import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine()); // 지원자 수
            int[][] applicants = new int[N][2];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                applicants[i][0] = Integer.parseInt(st.nextToken()); // 서류 등수
                applicants[i][1] = Integer.parseInt(st.nextToken()); // 면접 등수
            }

            // 서류 성적 기준으로 오름차순 정렬
            Arrays.sort(applicants, Comparator.comparingInt(a -> a[0]));

            int count = 1; // 서류 1등은 무조건 선발
            int bestInterviewRank = applicants[0][1]; // 현재까지의 최고 면접 순위

            for (int i = 1; i < N; i++) {
                if (applicants[i][1] < bestInterviewRank) {
                    count++;
                    bestInterviewRank = applicants[i][1]; // 최고 면접 순위 갱신
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }
}
