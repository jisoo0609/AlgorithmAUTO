class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while (coupon >= 10) {
            int service = coupon / 10;
            answer += service;
            // 사용한 쿠폰 제외하고 남은 쿠폰과 새로 받은 쿠폰을 합산
            coupon = service + (coupon % 10);
        }
        return answer;
    }
}