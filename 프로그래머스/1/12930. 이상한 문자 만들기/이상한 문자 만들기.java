class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] str = s.split(" ", -1);
        
        for(int i = 0; i < str.length; i++) {
            String word = str[i];
            
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            }
            
            if (i < str.length -1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}