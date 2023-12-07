import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 도감에 수락되어있는 포켓몬의 개수 n
        int n = Integer.parseInt(st.nextToken());
        // 맞춰야 하는 문제의 개수 m
        int m = Integer.parseInt(st.nextToken());

        // map이용해서 도감에 포켓몬 n 채워넣기
        Map<Integer, String> pokemonKeyOfNumber = new HashMap<>();
        Map<String, Integer> pokemonKeyOfName = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            pokemonKeyOfNumber.put(i, name);
            pokemonKeyOfName.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        // 문제맞추기
        for (int i = 0; i < m; i++) {
            String quiz = br.readLine();
            // 만약 도감 번호가 들어오면 이름 출력
            if (isNumber(quiz)) {
                sb.append(pokemonKeyOfNumber.get(Integer.parseInt(quiz))+"\n");
            }
            // 포켓몬 이름이 들어오면 도감 번호값 출력
            else {
                sb.append(pokemonKeyOfName.get(quiz)+"\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}