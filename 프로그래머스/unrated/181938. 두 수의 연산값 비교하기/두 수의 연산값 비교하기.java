class Solution {
    public int solution(int a, int b) {
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        int resultInt1 = Integer.parseInt(strA+strB);
        int resultInt2 = 2*a*b;
        
        return Math.max(resultInt1, resultInt2);
    }
}