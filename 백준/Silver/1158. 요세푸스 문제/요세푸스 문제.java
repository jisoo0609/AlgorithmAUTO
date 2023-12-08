import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        List<Integer> result = new ArrayList<>(n);
        Queue<Integer> people = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            people.offer(i);
        }

        int round = 0;
        while(!people.isEmpty()) {
            int person = people.poll();
            if (round == k-1) {
                result.add(person);
                round = 0;
            } else {

                people.offer(person);
                round++;
            }
        }

        String resultString = result.toString();
        resultString = resultString.substring(1, resultString.length()-1);

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(resultString);
        sb.append(">");

        System.out.println(sb);
    }
}