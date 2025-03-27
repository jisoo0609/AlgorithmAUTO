class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] exp = quiz[i].split(" ");
            
            int num1 = Integer.parseInt(exp[0]);
            int num2 = Integer.parseInt(exp[2]);
            int result = Integer.parseInt(exp[4]);
            
            String sign = exp[1];
            
            switch(sign) {
                case "+":
                    if (result == num1 + num2) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                break;
                case "-":
                    if (result == num1 - num2) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                break;
            }
        }
        
        return answer;
    }
}