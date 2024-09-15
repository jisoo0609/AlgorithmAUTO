import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 개수
        String[] input = br.readLine().split(" ");
        int nA = Integer.parseInt(input[0]);
        int nB = Integer.parseInt(input[1]);

        TreeSet<Integer> A = new TreeSet<>();

        input = br.readLine().split(" ");

        // 집합 A
        for (int i = 0; i < nA; i++) {
            A.add(Integer.parseInt(input[i]));
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < nB; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (A.contains(target)) {
                A.remove(target);
            }
        }

        System.out.println(A.size());
        for (int b : A) {
            System.out.print(b+" ");
        }
    }
}
