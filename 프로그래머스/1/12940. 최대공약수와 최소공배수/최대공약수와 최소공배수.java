class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
         
        // 최대공약수
        int gcd = 1;
        for (int i = 1; i <= Math.max(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        
        // 최소공배수
        int lcm = 1;
        if (Math.max(n, m) % Math.min(n, m) == 0) {
            lcm = Math.max(n, m);
        } else if (n % gcd == 0 && m % gcd == 0) {
            lcm = gcd * (n/gcd) * (m/gcd);
        } else {
            lcm = n * m;
        }
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
}