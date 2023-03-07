import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] board = new int[9][9];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

    }

    private static void dfs(int r, int c) {

        if (c == 9) {
            dfs(r + 1, 0);
            return;
        }
        if (r == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(board[i][j] + " ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }

        if (board[r][c] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (check(r, c, i)) {
                    board[r][c] = i;
                    dfs(r, c + 1);
                }
            }

            board[r][c] = 0;

            return;
        }

        dfs(r, c + 1);

    }

    private static boolean check(int r, int c, int i) {
        for (int a = 0; a < 9; a++) {
            if (board[r][a] == i)
                return false;
        }

        for (int a = 0; a < 9; a++) {
            if (board[a][c] == i)
                return false;
        }

        int smallSquare_r = (r / 3) * 3;
        int smallSquare_c = (c / 3) * 3;

        for (int a = smallSquare_r; a < smallSquare_r + 3; a++) {
            for (int b = smallSquare_c; b < smallSquare_c + 3; b++) {
                if (board[a][b] == i)
                    return false;
            }
        }
        return true;
    }

}
