import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받을 단어의 수
        int n = Integer.parseInt(br.readLine());
        // 그룹 단어의 수
        int count = n;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            // 입력받은 단어인지 체크하는 배열
            boolean[] check = new boolean[26];

            for (int j = 0; j < word.length(); j++) {
                if (!check[word.charAt(j) - 'a']) {
                    check[word.charAt(j) - 'a'] = true;
                } else if (j > 0 && word.charAt(j) != word.charAt(j - 1)) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}