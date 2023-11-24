import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		float[] score = new float[N];
		
		float max = score[0];
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		float[] correction = new float[score.length];
		for(int i=0; i<correction.length; i++) {
			correction[i] = score[i]/max*100;
		}
		
		
		float avg = 0;
		for(int i=0; i<correction.length; i++) {
			avg += correction[i]/N;
		}
		System.out.println(avg);
	}
}