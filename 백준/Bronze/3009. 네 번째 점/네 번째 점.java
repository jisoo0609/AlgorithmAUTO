import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" "); // 첫번째 점의 x, y 좌표
        String[] input2 = br.readLine().split(" "); // 두 번째 점의 x, y 좌표
        String[] input3 = br.readLine().split(" "); // 세 번째 점의 x, y 좌표

        int x;
        int y;

        // x좌표 비교
        // 만약, 첫번째 점의 x 좌표와 두번째 점의 x 좌표가 같으면
        if (input1[0].equals(input2[0])) {
            // 남은 점의 x 좌표는 세번째 점의 x좌표와 같다
            x = Integer.parseInt(input3[0]);

        } else if (input1[0].equals(input3[0])) {
            x = Integer.parseInt(input2[0]);
        } else {
            x = Integer.parseInt(input1[0]);
        }

        // y좌표 비교
        // 마찬가지로 만약, 첫번째 점의 y 좌표와 두번째 점의 y 좌표가 같으면
        if (input1[1].equals(input2[1])) {
            // 남은 점의 y 좌표는 세번째 점의 y 좌표와 같다
            y = Integer.parseInt(input3[1]);
        } else if (input1[1].equals(input3[1])) {
            y = Integer.parseInt(input2[1]);
        } else {
            y = Integer.parseInt(input1[1]);
        }

        System.out.println(x+" "+y);
    }
}
