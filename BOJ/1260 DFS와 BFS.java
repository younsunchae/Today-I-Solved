import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n, m, v;
	static int [][] map;
	static boolean [] visited;

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		map = new int[n+1][n+1];
		visited = new boolean[n+1];
		for (int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			map[a][b] = map[b][a] = 1;
			
		}
		
		
		DFS(v);
		System.out.println();
		
		visited = new boolean [n+1];
	
		BFS();

	}
	static void DFS (int L) {
		visited[L] = true;
		System.out.print(L + " ");
		
		for (int i=1; i<=n; i++) {
			if(visited[i] == false && map[L][i] ==1) {
				
				DFS(i);
			}
		}
	}
	static void BFS () {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(v);
		visited[v]  = true;
		System.out.print(v + " "); //시작점 출력해놓고 시작
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			
			for (int i=0; i<=n; i++) {
				if(map[temp][i] == 1 && !visited[i]) {
					q.offer(i);
					visited[i] = true;
					System.out.print(i+" ");
				}
			}
		}
	}
	
	

}
