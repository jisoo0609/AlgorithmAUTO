import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int n = arr.length;
        
        while (true) {
            boolean flag = true; 
            
            // 배열을 수정하는 과정
            for (int i = 0; i < n; i++) {
                int original = arr[i];  // 원래 값을 저장
                
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = (arr[i] * 2) + 1;
                }
                
                // 배열 값이 변경되었으면 flag false로 설정
                if (arr[i] != original) {
                    flag = false;
                }
            }
            
            // 배열이 더 이상 변하지 않으면 종료
            if (flag) {
                break;
            }
            
            answer++;  
        }
        
        return answer;
    }
}
