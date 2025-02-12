import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = readInt(), M = readInt();
        Beer[] beers = new Beer[readInt()];

        for (int i = 0; i < beers.length; i++) {
            beers[i] = new Beer(readInt(), readInt());
        }

        Arrays.sort(beers); // 도수 기준 오름차순 정렬

        bw.write(String.valueOf(findMinLiverLevel(N, M, beers)));
        bw.flush();
    }

    private static int findMinLiverLevel(int N, int M, Beer[] beers) {
        PriorityQueue<Integer> preferenceQueue = new PriorityQueue<>();
        int totalPreference = 0;

        for (Beer beer : beers) {
            preferenceQueue.add(beer.preference);
            totalPreference += beer.preference;

            if (preferenceQueue.size() > N) {
                totalPreference -= preferenceQueue.poll();
            }

            if (preferenceQueue.size() == N && totalPreference >= M) {
                return beer.alcohol;
            }
        }
        return -1;
    }

    private static class Beer implements Comparable<Beer> {
        int preference, alcohol;

        Beer(int preference, int alcohol) {
            this.preference = preference;
            this.alcohol = alcohol;
        }

        @Override
        public int compareTo(Beer o) {
            return Integer.compare(this.alcohol, o.alcohol);
        }
    }

    private static int readInt() throws IOException {
        int c, num = System.in.read() & 15;
        while ((c = System.in.read()) > 32) num = (num << 3) + (num << 1) + (c & 15);
        return num;
    }
}
