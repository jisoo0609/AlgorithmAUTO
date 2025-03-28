import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        
        for (int i = 0; i < k; i++) {
            result[i] = -1;
        }
        
        Set<Integer> set = new HashSet<>();
        int idx = 0;

        for (int n : arr) {
            if (!set.contains(n)) {
                set.add(n);
                result[idx++] = n;

                if (idx == k) {
                    break;
                }
            }
        }
        
        return result;
    }
}