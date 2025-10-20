class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        
        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i];

            if (operation.charAt(0) == 'X' && operation.charAt(1) == '+') {
                x++;
            } else if (operation.charAt(0) == 'X' && operation.charAt(1) == '-') {
                x--;
            } else if (operation.charAt(0) == '+') {
                ++x;
            } else if (operation.charAt(0) == '-') {
                --x;
            }
        }
        return x;
    }
}