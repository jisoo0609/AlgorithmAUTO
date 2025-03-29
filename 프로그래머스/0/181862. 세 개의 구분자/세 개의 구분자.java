import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] subStr = myStr.split("a|b|c");
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < subStr.length; i++) {
            if (!subStr[i].isEmpty()) {
                result.add(subStr[i]);
            }
        }
        
        if (result.isEmpty()) {
            result.add("EMPTY"); 
        }
        
        return result.toArray(new String[0]);
    }
}