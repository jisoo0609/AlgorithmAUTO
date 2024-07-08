import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String [] s = br.readLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        arr = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(arr);
        
        for(int num : arr) {
            System.out.println(num);
        }
    }
}
