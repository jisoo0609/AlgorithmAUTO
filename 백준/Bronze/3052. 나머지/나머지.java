import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine())% 42;
		}

		int count = 0;
		boolean bl;
		for (int i = 0; i < arr.length; i++) {
			bl = false;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					bl = true;
					break;
				}
			}
			if (bl == false) {
				count++;
			}
		}
		System.out.print(count);
	}
}