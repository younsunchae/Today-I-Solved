import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); 

        for (int t = 0; t < tc; t++) {
            int N = sc.nextInt(); 
            int M = sc.nextInt(); 

            int[][] dp = new int[N + 1][M + 1]; 

       
            for (int i = 1; i <= M; i++) {
                dp[1][i] = i;
            }

            for (int i = 2; i <= N; i++) {
                for (int j = i; j <= M; j++) {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
                }
            }

            System.out.println(dp[N][M]); 
        }

    }
}
