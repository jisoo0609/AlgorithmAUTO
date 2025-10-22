import java.util.*;

class Solution {
    public int solution(String s) {
        Stack <Character> stack = new Stack<>();
        
        // 같은 문자가 연속해서 나타나면 제거하고, 
        // 그 다음 문자로 넘어가는 것
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {    // 짝이 맞으면 제거(pop)
                stack.pop();
            } else {    // 짝이 맞지 않으면 push
                stack.push(c);
            }
        }
        
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}