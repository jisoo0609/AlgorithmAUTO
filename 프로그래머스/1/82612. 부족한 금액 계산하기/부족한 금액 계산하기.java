class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        // 요금
        long pay = 0;
        for (int i = 1; i <= count; i++) {
            // 회차 당 가격
            pay += price * i;
        }
        
        // 다 타도 돈이 모자르지 않는 경우
        if (money > pay) {
            answer = 0;
        } else {
            answer = Math.abs(money - pay);
        }
        
        return answer;
    }
}