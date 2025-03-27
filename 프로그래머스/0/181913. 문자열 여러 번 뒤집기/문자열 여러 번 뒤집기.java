class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            String subStr = sb.substring(s, e + 1);
            String reverseStr = new StringBuilder(subStr).reverse().toString();
            
            sb.replace(s, e+1, reverseStr);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}