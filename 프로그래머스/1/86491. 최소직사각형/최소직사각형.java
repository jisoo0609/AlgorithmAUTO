class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int minH = 0;
        
        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            
            maxW = Math.max(maxW, w);
            minH = Math.max(minH, h);
        }
        
        return maxW * minH;
    }
}