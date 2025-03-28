class Solution {
    public int solution(String my_string) {
        int sum = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        
        if (sb.length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }
        
        
        return sum;
    }
}