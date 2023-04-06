import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] board;
    static boolean[][] visited;
    static int N, M, count, max;
    static int dx[] = { 0, 0, -1, 1 };
    static int dy[] = { -1, 1, 0, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        visited = new boolean[N][M];
        count = 0;
        max = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] == 1 && !visited[i][j]) {
                    count++;
                    int size = dfs(i, j);
                    max = Math.max(size, max);
                }
            }
        }
        System.out.println(count);
        System.out.println(max);

    }

    private static int dfs(int x, int y) {
        visited[x][y] = true;
        int size = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M && board[nx][ny] == 1 && !visited[nx][ny]) {
                size += dfs(nx, ny);
            }
        }
        return size;
    }

}
