class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 경우의 수 -> 3
        // 중복된 점 고를 수 없음
        // (0, 1),(2, 3) | (0, 2),(1, 3) | (0, 3), (1, 2)
        
        // case 1
        double slope1 = getSlope(dots[0], dots[1]);
        double slope2 = getSlope(dots[2], dots[3]);
        if (slope1 == slope2) {
            answer = 1;
        } 
        
        // case 2
        slope1 = getSlope(dots[0], dots[2]);
        slope2 = getSlope(dots[1], dots[3]);
        if (slope1 == slope2) {
            answer = 1;
        } 
        
        // case 3
        slope1 = getSlope(dots[0], dots[3]);
        slope2 = getSlope(dots[1], dots[2]);
        if (slope1 == slope2) {
            answer = 1;
        } 
        
        return answer;
    }
    
    public double getSlope(int[] dot1, int[] dot2) {
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
}