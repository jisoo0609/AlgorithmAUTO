import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] chars = new char[5][];
		
		int max = 0;
		for(int i = 0; i < chars.length; i++) {
			chars[i] = br.readLine().toCharArray();	
			if (max < chars[i].length) {
				max = chars[i].length;
			}
		}
		
		// 이차원 배열의 행을 바꾸면서 열의 첫 글자를 읽어옴
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
				if(!(i < chars[j].length)) continue;
				sb.append(chars[j][i]);
			}
		}
		System.out.print(sb);
	}
}