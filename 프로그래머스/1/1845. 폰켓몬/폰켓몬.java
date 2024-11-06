import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // 가져가야 할 폰켓몬 개수
        int count = nums.length / 2;

        HashSet<Integer> pokemon = new HashSet<>();
        for (int n : nums) {
            pokemon.add(n);
        }

        if (pokemon.size() >= count) {
            return count;
        } else {
            return pokemon.size();
        }
    }
}