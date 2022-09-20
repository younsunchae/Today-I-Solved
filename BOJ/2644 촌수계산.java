import java.util.Scanner;

public class Main {
	
	static int n;
	static int x,y;
	static int m;
	static int cnt = -1;
	static int[][] map;
	static boolean [] checked;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //사람 수
		x = sc.nextInt(); y = sc.nextInt(); //계산할 사람들
		m = sc.nextInt(); //간선 수
		
		map = new int[n+1][n+1];
		checked = new boolean[n+1];
		
		for (int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			map[a][b] = map[b][a] = 1;
			
			
		}
		
		DFS(x,0);
		System.out.println(cnt);
		

	}
	
	static void DFS (int L, int d) {
		checked[L] = true;
		if(L==y) {
			cnt = d;
			return;
		}
		for (int i=1; i<=n; i++) {
			
			if(!checked[i] && map[L][i]==1) {
				checked[i] = true;
				DFS(i, d+1);
				checked[i] = false;
				
			}
		}
		
	}

}
