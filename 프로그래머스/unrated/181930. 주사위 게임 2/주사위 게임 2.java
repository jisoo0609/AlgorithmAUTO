import java.util.Arrays;

class Solution {
     public int solution(int a, int b, int c) {
        int answer = 0;
        int[] numbers = {a, b, c};

        Arrays.sort(numbers);


        if (numbers[0] == numbers[2]) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else {
            answer = a + b + c;
        }
        return answer;
    }
}