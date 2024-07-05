import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        long ab = Long.parseLong(String.format(input[0] + input[1]));
        long cd = Long.parseLong(String.format(input[2] + input[3]));

        long sum = ab + cd;
        System.out.println(sum);
    }
}