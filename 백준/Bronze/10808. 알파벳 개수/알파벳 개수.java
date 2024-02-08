import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] alp = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char next = str.charAt(i);

            alp[next - 'a']++;
        }

        for (int n : alp) {
            System.out.print(n+" ");
        }
    }
}