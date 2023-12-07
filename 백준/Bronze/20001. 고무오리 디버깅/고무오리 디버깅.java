import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int count = 0;

        while (true) {
            line = br.readLine();

            if (line.equals("고무오리 디버깅 끝")) break;

            if (line.equals("문제")) {
                count++;
            } else if (line.equals("고무오리") && count != 0){
                count--;
            } else {
                count +=2;
            }
        }

        if (count == 0) {
            System.out.println("고무오리야 사랑해");
        } else {
            System.out.println("힝구");
        }
    }
}