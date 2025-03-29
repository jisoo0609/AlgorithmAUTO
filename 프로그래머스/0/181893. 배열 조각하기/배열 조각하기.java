import java.util.Arrays;

class Solution {
   public static int[] solution(int[] arr, int[] query) {
        // 범위 설정 (이상, 미만)
        int left = 0;
        int right = arr.length;
        // 모든 query를 순서에 맞게 가져오기
        for (int i = 0; i < query.length; i++) {
            // 짝수번째 쿼리라면 오른쪽에서 안쪽으로 들어오기
            if (i% 2 == 0) {
                // 결과 배열의 실제 시작지점은 0이 아닌 left부터
                right = left + query[i] + 1;
            }
            // 홀수번째 쿼리라면 왼쪽에서 안쪽으로 들어오기
            else {
                left += query[i];
            }
        }
        // 결과 반환
        return Arrays.copyOfRange(arr, left, right);
    }
}