import java.util.Scanner;

public class Main{

	static int N,M;
	static int [][] map;
	static int cnt;
	static int visited[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int [N+1][N+1];
		visited = new int [N+1];
		
		for (int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			map[a][b] = map[b][a] = 1;
			
		}
		DFS(1);
		System.out.println(cnt);
		
		
		
		
		
		
		
		
	}
	
	public static void DFS(int L) {
		
		visited[L] =1;
		for (int i=1; i<=N;i++) {
			if(map[L][i]==1 && visited[i]==0) {
				DFS(i);
				cnt++;
			}
		}
		
	}

}
