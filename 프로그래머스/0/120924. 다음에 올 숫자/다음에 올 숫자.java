class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if (common[1] - common[0] == common[2] - common[1]) {
            int temp = common[1] - common[0];
            answer = common[common.length - 1] + temp;
        } else {
            int temp = common[1] / common[0];
            answer = common[common.length - 1] * temp;
        }
        
        return answer;
    }
}