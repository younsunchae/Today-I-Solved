import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int N,M;
	static int [][]map;
	static boolean [][] visited;
	static int cnt;
	static int[] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int [N][M];
		
		visited = new boolean [N][M];
		 
		for (int i=0; i<N; i++) {
			
			String str = sc.next();
			for (int j=0; j<M; j++) {
				
				map[i][j] = str.charAt(j) - '0';
		}
		
		
		
	}
		BFS(new Pos(0,0));
		System.out.println(map[N-1][M-1]);

}
	
	static void BFS (Pos p) {
		
		Queue<Pos> q = new LinkedList<Pos>();
		q.offer(p);
		visited[p.x][p.y] = true;
		
		while(!q.isEmpty()) {
			Pos ps = q.poll();
			for (int i=0; i<4; i++) {
				int xx = ps.x + dx[i];
				int yy = ps.y + dy[i];
				if(xx>=0 && yy >=0 && xx<N && yy<M ) {
					if(map[xx][yy]==1 && !visited[xx][yy]) {
						q.offer(new Pos(xx,yy));
						visited[xx][yy] = true;
						map[xx][yy] = map[ps.x][ps.y] +1;
						
					}
					
				}
				
					
				
			}
		}
		
	}
	public static class Pos {
		int x,y;
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
			
		}
		
	}

}

