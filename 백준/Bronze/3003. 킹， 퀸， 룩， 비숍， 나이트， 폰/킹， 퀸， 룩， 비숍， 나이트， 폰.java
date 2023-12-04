import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 어떤 입력에 대하여 버퍼링 기능 제공
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. 흰색 피스의 개수 입력
        String input = br.readLine();

        // 주어진 인자를 (정규표현식으로 활용해) 기준으로 삼아
        // 문자열을 나눈 배열을 반환한다
        String[] splitString = input.split(" ");


        // 1. 기준이 되는 체스말을 정수 배열로 저장
        int[] piece = {1, 1, 2, 2, 2, 8};
    
        // 2. 입력받은 각각의 체스말을 살펴본다
        // 어떤 말인지 보기 위해 for i  반복을 한다
        for (int i = 0; i < 6; i++) {
            // 3. 이번 말을 확인한다
            String pieceRaw = splitString[i];
            // 4. 동일한 말에서, 기준 갯수와 다른 만큼 빼준다
            piece[i] -= Integer.parseInt(pieceRaw);
        }
        
        for (int n : piece) {
            System.out.print(n+" ");
        }
    }
}