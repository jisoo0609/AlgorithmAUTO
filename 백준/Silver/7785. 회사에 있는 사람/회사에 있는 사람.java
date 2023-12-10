import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 출입 기록의 수 n
        int n = Integer.parseInt(br.readLine());

        Map<String, String> records = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            String name = input[0];
            String commute = input[1];

            if (records.containsKey(name)) {
                records.putIfAbsent(name, commute);
            }
            records.put(name, commute);
        }

        // 역순 정렬
        List<String> keySet= new ArrayList<String>(records.keySet());
        Collections.sort(keySet, Collections.reverseOrder());

        // 회사에 있는 사람 출력
        for (String key : keySet) {
            if (records.get(key).equals("enter")) {
                sb.append(key+"\n");
            }
        }
        System.out.println(sb);
    }
}