import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 피사노 주기 : M = 10^k 일 때, k > 2 라면, 주기는 항상 15 × 10^(k-1)
    // M = 10^6 이기 때문에, 주기는 15 × 10^5 = 1500000
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        N %= 1500000;
        long[] list = new long[(int) (N + 1)];
        list[0] = 0;
        list[1] = 1;
        for (int i = 2; i <= N; i++) {
            list[i] = (list[i - 1] + list[i - 2]) % 1000000;

        }

        System.out.println(list[(int) N] % 1000000);

    }

}
