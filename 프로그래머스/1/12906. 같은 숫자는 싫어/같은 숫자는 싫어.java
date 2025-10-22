import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            int now = arr[i];
            if (stack.isEmpty()) {
                stack.push(now);
            } else if (stack.peek() != now) {
                stack.push(now);
            }
        }
        
        int[] answer = stack.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
    
        return answer;
    }
}