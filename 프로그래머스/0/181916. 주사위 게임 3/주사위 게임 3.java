import java.util.HashMap;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        /** 
        1. 네 주사위가 모두 같은 경우
        2. 세 주사위가 같은 숫자이고, 나머지 하나가 다른 숫자인 경우
        3. 두개씩 같은 숫자가 두 개 있을 경우
        4. 하나의 숫자가 2개, 나머지 2개의 숫자가 각각 다른 경우
        5. 네 주사위 모두 다른 숫자인 경우
        */
        
        // 주사위의 경우의 수
        int[] dice = {a, b, c, d};
        // 숫자의 등장 횟수 기록 (dice, count)
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < dice.length; i++) {
            int count = 0;
            
            if (map.containsKey(dice[i])) {
                count = map.get(dice[i]);
            } else {
                count = 0;
            }
            
            map.put(dice[i], count+1);
        }
        
        
        // 조건 확인
        // 1. 네 주사위가 모두 같은 경우
        if (map.size() == 1) {
            int p = dice[0];
            answer = 1111 * p;
        }
        
        // 2. 세 주사위가 같은 숫자이고, 나머지 하나가 다른 숫자인 경우
        // 3. 두 개씩 같은 숫자가 두 개 있을 경우
        else if (map.size() == 2) {
            // 등장 횟수가 3인 숫자와 1인 숫자 찾기
            int p = 0;
            int q = -1;
            boolean flag = false;
            
            for (int key : map.keySet()) {
                if (map.get(key) == 3) {
                    p = key;
                } else if (map.get(key) == 1) {
                    q = key;
                } else if (map.get(key) == 2) {
                    flag = true;
                }
            }
            
            // 세 주사위가 같은 숫자이고, 나머지 하나가 다른 숫자일 경우
            if (q != -1) {
                answer = (10 * p + q) * (10 * p + q);
            }
            
            // 두 개씩 같은 숫자가 두 개 있을 경우
            else if (flag) {
                int p2 = 0, q2 = 0;
                int idx = 0;
                // 등장 횟수 2인 숫자 두 개를 찾아서 p와 q에 할당
                for (int key : map.keySet()) {
                    if (map.get(key) == 2) {
                        if (idx == 0) {
                            p2 = key;  
                        } else {
                            q2 = key;  
                        }
                        idx++;
                    }
                }
                answer = (p2 + q2) * Math.abs(p2 - q2);
            }
        }

        // 4. 하나의 숫자가 2개, 나머지 2개의 숫자가 각각 다른 경우
        else if (map.size() == 3) {
            int p = 0;
            int q = 0;
            int r = 0;
            
            // 등장 횟수 2인 숫자와 1인 숫자 2개 찾기
            for (int key : map.keySet()) {
                if (map.get(key) == 2) {
                    p = key;
                } else if (map.get(key) == 1) {
                    if (q == 0) {
                        q = key;
                    } else {
                        r = key;
                    }
                }
            }
            answer = q * r;
        }
        
        // 5. 네 주사위 모두 다른 숫자인 경우
        if (map.size() == 4) {
            int min = Integer.MAX_VALUE;
            
            for (int key : map.keySet()) {
                if (min > key) {
                    min = key;
                }
            }
            answer = min;
        }
    
        return answer;
    }
}