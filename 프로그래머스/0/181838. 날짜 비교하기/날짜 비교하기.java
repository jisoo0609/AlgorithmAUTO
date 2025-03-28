class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        StringBuilder date1Str = new StringBuilder();
        for (int i = 0; i < date1.length; i++) {
            date1Str.append(date1[i]);
        }
        
        StringBuilder date2Str = new StringBuilder();
        for (int i = 0; i < date2.length; i++) {
            date2Str.append(date2[i]);
        }
        
        int date1Int = Integer.parseInt(date1Str.toString());
        int date2Int = Integer.parseInt(date2Str.toString());
        
        if (date1Int - date2Int < 0) {
            answer = 1;
        }        
        
        return answer;
    }
}