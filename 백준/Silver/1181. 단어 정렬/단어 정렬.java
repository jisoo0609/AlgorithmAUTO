import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        // 1. 사전순으로 정렬
        Arrays.sort(str);
        // 2. 길이가 짧은 것부터 정렬
        Arrays.sort(str, Comparator.comparingInt(String::length));


        for (int i = 0; i < n; i++) {
            if (i != 0 && str[i].equals(str[i-1]))
                continue;
            System.out.println(str[i]);
        }
    }
}
