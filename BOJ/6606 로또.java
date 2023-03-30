import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] s;
    static int[] result;
    static int k;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if (k == 0)
                break;
            s = new int[k];
            result = new int[6];
            for (int i = 0; i < k; i++) {
                s[i] = Integer.parseInt(st.nextToken());
            }

            DFS(0, 0);
            System.out.println();

        }

    }

    private static void DFS(int L, int start) {

        if (L == 6) {
            Arrays.sort(result);
            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < k; i++) {
            result[L] = s[i];
            DFS(L + 1, i + 1);

        }

    }

}
