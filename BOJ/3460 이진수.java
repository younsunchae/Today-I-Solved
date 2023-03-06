import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static int N;
    static ArrayList<Integer> ans;
    static int count;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int t = 0; t < tc; t++) {
            N = Integer.parseInt(br.readLine());
            ans = new ArrayList<>();
            count = 0;
            dfs(N);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
        }

    }

    private static void dfs(int n) {

        if (n == 0) {
            return;
        } else {
            if (n % 2 == 1) {
                ans.add(count);
            }
            count++;
            dfs(n / 2);
        }
    }

}
