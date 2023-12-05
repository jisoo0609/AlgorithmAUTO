import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            arr = new int[]{-1};
            return arr;
        }
        int[] index = list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(index));
        int start = index[0];
        int end = index[index.length - 1];
        System.out.println(start +" "+ end);

        int idx = 0;
        int[] answer = new int[end - start+1];
        for (int i = start; i <= end; i++) {
            answer[idx++] = arr[i];
        }

        return answer;
    }
}