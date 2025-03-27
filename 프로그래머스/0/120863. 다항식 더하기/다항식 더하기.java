class Solution {
    public String solution(String polynomial) {
        int x = 0;  // x항
        int constant = 0;   // 상수항
        
        String[] exps = polynomial.split(" \\+ ");
        
        for (String exp : exps) {
            if (exp.contains("x")) {
                String temp = exp.replace("x", "").trim();
                
                if (temp.isEmpty()) {
                    x += 1;
                } else {
                    x += Integer.parseInt(temp);
                }
            } else {
                constant += Integer.parseInt(exp);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (x != 0) {
            if (x == 1) {
                sb.append("x");
            } else if (x == -1) {
                sb.append("-x");
            } else {
                sb.append(x).append("x");
            }
        }
        
        if (constant != 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(constant);
        }
        
        return sb.toString();
    }
}
