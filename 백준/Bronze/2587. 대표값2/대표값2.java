import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(nums);

        // 평균 구하기
        System.out.println(avg(nums));

        // 중앙값 구하기
        System.out.println(median(nums));
    }
    // 평균을 구하는 메서드
    public static int avg(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum/arr.length;
    }

    // 중앙값 구하는 메서드
    public static int median(int[] arr) {
        if (arr.length%2 == 0) {
            return arr[arr.length/2+1];
        } else {
            return arr[arr.length/2];
        }
    }
}