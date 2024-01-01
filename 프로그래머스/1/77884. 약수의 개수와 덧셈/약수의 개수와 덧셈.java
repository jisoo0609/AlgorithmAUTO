class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        // left ~ right 까지 순회하면서
        for (int i = left; i <= right; i++) {
            // 약수의 개수
            int count = 0;

            // 숫자 i의 약수 구한다
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            // 만약 약수의 개수가 짝수라면 더하고
            if (count % 2 == 0) {
                answer += i;
            }
            // 아니라면 뺀다
            else {
                answer -= i;
            }
        }
        return answer;
    }
}