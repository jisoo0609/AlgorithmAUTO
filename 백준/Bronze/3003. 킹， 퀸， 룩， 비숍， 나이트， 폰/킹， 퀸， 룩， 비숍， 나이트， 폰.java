import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1, 1, 2, 2, 2, 8};
		int[] cnt = new int[6];
		
		for(int i=0; i<cnt.length; i++) {
			cnt[i] = sc.nextInt();
		}
	
		for(int i=0; i<arr.length; i++) {
			cnt[i] = arr[i] - cnt[i];
			System.out.print(cnt[i]+" ");
		}		
	}
}