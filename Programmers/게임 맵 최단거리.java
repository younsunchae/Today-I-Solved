import java.util.*;

class Solution {

    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static boolean[][] check;
    static int n, m, answer;

    static class Pos {
        int x, y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static Queue<Pos> q = new LinkedList<>();

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        check = new boolean[n][m];
        answer = bfs(0, 0, maps);

        return answer;
    }

    static int bfs(int x, int y, int[][] maps) {
        check[x][y] = true;
        q.offer(new Pos(x, y));
        answer = 1;
        while (!q.isEmpty()) {
            Pos pos = q.poll();
            if (pos.x == n - 1 && pos.y == m - 1) {
                return maps[n - 1][m - 1];
            }
            for (int i = 0; i < 4; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !check[nx][ny] && maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[pos.x][pos.y] + 1;
                    check[nx][ny] = true;
                    q.offer(new Pos(nx, ny));
                }
            }

        }
        return -1;
    }
}