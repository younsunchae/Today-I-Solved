import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String op = st.nextToken();

                int num = Integer.parseInt(st.nextToken());

                if (op.equals("I")) {
                    tm.put(num, tm.getOrDefault(num, 0) + 1);
                } else {
                    if (tm.isEmpty())
                        continue;

                    int key;
                    if (num == 1) {
                        key = tm.lastKey();
                    } else {
                        key = tm.firstKey();
                    }

                    int value = tm.get(key);

                    if (value == 1) {
                        tm.remove(key);
                    } else {
                        tm.put(key, value - 1);
                    }

                }

            }
            if (tm.isEmpty()) {
                sb.append("EMPTY\n");
            } else {
                sb.append(tm.lastKey() + " ").append(tm.firstKey() + "\n");
            }
        }

        System.out.println(sb);

    }

}
