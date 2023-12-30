import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String[] input = br.readLine().split(" ");

            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int z = Integer.parseInt(input[2]);

            if (x == 0 && y == 0 && z == 0) break;

            if ((x*x + y*y) == z*z) {
                System.out.println("right");
            } else if ((x*x + z*z) == y*y) {
                System.out.println("right");
            } else if ((y*y + z*z) == x*x) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}