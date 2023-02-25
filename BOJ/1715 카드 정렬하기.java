import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            q.add(Integer.parseInt(br.readLine()));
        }

        while (true) {
            if (q.size() == 1) {
                break;
            }

            int a = q.poll();
            int b = q.poll();

            answer += a + b;

            q.add(a + b);
        }

        System.out.println(answer);

    }

}
