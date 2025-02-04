// 막대기
// https://www.acmicpc.net/problem/17608

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] blocks = new int[n];

        for (int i = 0; i < n; i++) {
            blocks[i] = Integer.parseInt(br.readLine());
        }

        int maxHeight = 0;
        int count = 0;

        for (int i = n-1 ; i >= 0; i--) {
            int height = blocks[i];
            if (height > maxHeight) {
                maxHeight = height;
                count++;
            }
        }
        System.out.println(count);
    }

}