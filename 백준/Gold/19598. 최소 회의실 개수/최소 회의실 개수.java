import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // 회의 개수
        
        int[][] meetings = new int[N][2];  // 회의 정보 저장
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken());  // 시작 시간
            meetings[i][1] = Integer.parseInt(st.nextToken());  // 종료 시간
        }

        // 1. 회의 시작 시간을 기준으로 정렬 (같은 경우, 종료 시간을 기준으로 정렬)
        Arrays.sort(meetings, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        // 2. 우선순위 큐(최소 힙) 사용 - 현재 진행 중인 회의의 종료 시간을 관리
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(meetings[0][1]);  // 첫 번째 회의 종료 시간 추가

        // 3. 모든 회의에 대해 회의실 배정
        for (int i = 1; i < N; i++) {
            // 현재 진행 중인 회의 중 가장 빨리 끝나는 회의와 비교
            if (pq.peek() <= meetings[i][0]) {
                pq.poll();  // 기존 회의실 사용 가능 -> 가장 빨리 끝나는 회의 제거
            }
            pq.offer(meetings[i][1]);  // 새 회의 추가
        }

        // 4. 최소 회의실 개수 출력
        System.out.println(pq.size());
    }
}
