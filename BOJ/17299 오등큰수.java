import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int[] ans = new int[N];
        int[] f = new int[1000001];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            f[arr[i]]++;
        }

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < N; i++) {
            while (!s.isEmpty() && f[arr[i]] > f[arr[s.peek()]]) {
                ans[s.pop()] = arr[i];
            }
            s.push(i);
        }

        while (!s.empty()) {
            ans[s.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i] + " ");
        }
        System.out.println(sb);

    }

}
