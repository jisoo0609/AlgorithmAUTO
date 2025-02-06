import java.io.*;
import java.util.*;

class Student {
    int id, favoriteMenu;
    public Student(int id, int favoriteMenu) {
        this.id = id;
        this.favoriteMenu = favoriteMenu;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        Deque<Student> queue = new ArrayDeque<>();
        TreeSet<Integer> listA = new TreeSet<>();
        TreeSet<Integer> listB = new TreeSet<>();
        TreeSet<Integer> listC = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int id = Integer.parseInt(st.nextToken());
                int favoriteMenu = Integer.parseInt(st.nextToken());
                queue.addLast(new Student(id, favoriteMenu)); // 뒤에 추가
            } else {
                int menu = Integer.parseInt(st.nextToken());
                if (!queue.isEmpty()) {
                    Student student = queue.pollFirst(); // 맨 앞 학생 제거
                    if (student.favoriteMenu == menu) {
                        listA.add(student.id);
                    } else {
                        listB.add(student.id);
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            listC.add(queue.pollFirst().id);
        }

        printList(bw, listA);
        printList(bw, listB);
        printList(bw, listC);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void printList(BufferedWriter bw, TreeSet<Integer> list) throws IOException {
        if (list.isEmpty()) {
            bw.write("None\n");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int num : list) {
                sb.append(num).append(" ");
            }
            bw.write(sb.toString().trim() + "\n");
        }
    }
}
