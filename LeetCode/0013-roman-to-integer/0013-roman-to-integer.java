class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> symbols = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int number = 0; // result
        
        int left = 0;

        while (left < s.length() - 1) {
            int current = symbols.get(s.charAt(left));
            int next = symbols.get(s.charAt(left + 1));

            if (current < next) {
                number -= current;
            } else {
                number += current;
            }

            left++;
        }

        number += symbols.get(s.charAt(s.length() - 1));

        return number;
    }
}