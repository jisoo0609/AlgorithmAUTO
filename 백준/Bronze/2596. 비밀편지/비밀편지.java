import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] code = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
        String[] key = {"A", "B", "C", "D", "E", "F", "G", "H"};

        // 문자의 개수
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] arr = new String[input.length() / 6];

        for (int i = 0; i < input.length(); i += 6) {
            arr[i / 6] = input.substring(i, i + 6);
        }

        for (int i = 0; i < n; ++i) {
            boolean found = false;

            for (int j = 0; j < code.length; j++) {
                // 문자열이 완전히 일치하는 경우
                if (code[j].equals(arr[i])) {
                    sb.append(key[j]);
                    found = true;
                    break;
                }

                // 문자열이 부분 일치하는 경우
                else {
                    int count = 0;
                    for (int k = 0; k < 6; k++) {
                        if (code[j].charAt(k) != arr[i].charAt(k)) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        sb.append(key[j]);
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(sb.toString());
    }
}