class Solution {
    public int solution(int a, int b) {
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        String str1 = strA + strB;
        String str2 = strB + strA;

        if (Integer.parseInt(str1) >= Integer.parseInt(str2)) {
            return Integer.parseInt(str1);
        } else {
            return Integer.parseInt(str2);
        }
    }
}