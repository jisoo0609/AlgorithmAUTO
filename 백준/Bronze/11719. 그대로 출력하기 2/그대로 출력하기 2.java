// 그대로 출력하기 2
// https://www.acmicpc.net/problem/11719

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        String input;

        while ((input = br.readLine()) != null) {
            System.out.println(input);
        }
    }
}
