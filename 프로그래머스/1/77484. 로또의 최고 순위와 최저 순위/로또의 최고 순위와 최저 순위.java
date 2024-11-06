class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // 맞는 번호 수
        int count = 0;
        // 모르는 번호의 개수
        int zero = 0;
        // 맞은 번호 개수
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            }
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }

        // 0의 개수가 전부 맞을 때 -> 최고
        int max = count + zero;
        // 0의 개수가 전부 틀릴 때 -> 최저
        int min = count;

        // 맞은 갯수로 랭크 계산
        answer[0] = getRank(max);
        answer[1] = getRank(min);

        return answer;
    }

    public static int getRank(int count) {
        switch (count) {
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return 6;
        }
    }
}