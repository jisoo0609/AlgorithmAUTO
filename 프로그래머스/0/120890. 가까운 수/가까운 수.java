class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        
        int min = n;
        for (int i = 0; i < array.length; i++) {
            int abs =  Math.abs(array[i] - n);
            if (min > abs) {
                min = abs;
                answer = array[i];
            } else if (min == abs) {
                if (answer > array[i]) {
                    answer = array[i]; 
                }
            }
        }
        
        return answer;
    }
}