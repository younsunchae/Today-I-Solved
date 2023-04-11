import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] code = new int[N];
        int[] ans = new int[N];
        boolean flag = true;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            code[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(code);

        char[] s = br.readLine().toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                ans[i] = 0;
            } else if (s[i] >= 'A' && s[i] <= 'Z') {
                ans[i] = (int) s[i] - 64;
            } else {
                ans[i] = (int) s[i] - 70;
            }
        }
        Arrays.sort(ans);

        for (int i = 0; i < N; i++) {
            if (ans[i] != code[i]) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "y" : "n");

    }

}
