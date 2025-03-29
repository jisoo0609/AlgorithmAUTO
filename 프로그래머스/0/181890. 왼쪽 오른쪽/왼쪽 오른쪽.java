import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> result = new ArrayList<>();
        
        int lIdx = -1;
        int rIdx = -1;
        
        // l과 r의 인덱스를 찾기
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") && lIdx == -1) {
                lIdx = i;  
            }
            if (str_list[i].equals("r") && rIdx == -1) {
                rIdx = i;  
            }
        }
        
        // l과 r이 둘 다 없는 경우
        if (lIdx == -1 && rIdx == -1) {
            return new String[0]; 
        }
        
        // l이 먼저 나오면 l 기준으로 왼쪽 부분을 반환
        if (lIdx != -1 && (rIdx == -1 || lIdx < rIdx)) {
            for (int i = 0; i < lIdx; i++) {
                result.add(str_list[i]);
            }
        }
        
        // r이 먼저 나오면 r 기준으로 오른쪽 부분을 반환
        if (rIdx != -1 && (lIdx == -1 || rIdx < lIdx)) {
            for (int i = rIdx + 1; i < str_list.length; i++) {
                result.add(str_list[i]);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
