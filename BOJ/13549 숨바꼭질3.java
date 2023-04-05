import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static int max = 100001;
    static int[] check;

    static class Node {
        int x, time;

        Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }

    static Queue<Node> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        check = new int[max];
        q = new LinkedList<>();
        System.out.println(BFS());

    }

    private static int BFS() {
        q.offer(new Node(N, 0));
        check[N] = 1;
        while (!q.isEmpty()) {
            Node node = q.poll();

            if (node.x == K) {
                return node.time;
            }

            if (node.x * 2 < max && check[node.x * 2] == 0) {
                q.add(new Node(node.x * 2, node.time));
                check[node.x * 2] = 1;

            }
            if (node.x - 1 >= 0 && check[node.x - 1] == 0) {
                q.add(new Node(node.x - 1, node.time + 1));
                check[node.x - 1] = 1;

            }
            if (node.x + 1 < max && check[node.x + 1] == 0) {
                q.add(new Node(node.x + 1, node.time + 1));
                check[node.x + 1] = 1;

            }
        }
        return -1;

    }

}
