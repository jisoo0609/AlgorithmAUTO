import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 정답을 담기 위한 리스트
        // 담을 원소의 개수를 알고 있다면 생성자 생성시 값 전달해 배열 미리 만듦
        List<Integer> result = new ArrayList<>(n);

        // 사람을 빼내기 위한 큐
        Queue<Integer> people = new LinkedList<>();

        // 큐에 1~n까지 숫자 넣음
        for (int i = 1; i <= n; i++) {
            people.offer(i);
        }

        // 현재 몇번째 사람인지 기록
        int round = 0;
        // 큐가 빌 때까지 반복
        while (!people.isEmpty()) {
            int person = people.poll();
            // round가 사람을 빼낼 차례인지 확인
            if (round == k-1) {
                result.add(person);
                // 초기화
                round = 0;
            } else {
                // 아니면 다시 큐로 넣음
                people.offer(person);
                round++;
            }
        }

        String resultString = result.toString();
        // resultString -> [3, 6, 2, 7, 5, 1, 4]라 subString()으로 [ ] 제거
        resultString = resultString.substring(1, resultString.length()-1);
        // 출력 결과
        // <+"resultString"+> 형태
        StringBuilder sb = new StringBuilder();

        sb.append("<");
        sb.append(resultString);
        sb.append(">");

        System.out.println(sb);
    }
}