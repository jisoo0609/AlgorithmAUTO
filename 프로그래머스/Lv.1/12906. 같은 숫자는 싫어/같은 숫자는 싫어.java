import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        // 스택에 arr 원소 집어넣음
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}