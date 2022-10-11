import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] map;
	static boolean [][] check;

	static int [] dx = {-1,0,1,0};
	static int [] dy = {0,1,0,-1};
	static int count;
	
	
 	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer (br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		map = new int [N][M];
		check = new boolean [N][M];
		
		count = 0;
	
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
			}
		}
		
		clean(r,c,d);
		System.out.println(count);
	

	}
 	static void clean (int x, int y, int d) {
 		boolean flag = false;
 		if(!check[x][y] && map[x][y] ==0) {
 			check[x][y] = true;
 			count++;
 			
 		}
 		
 		
 		for (int i=0; i<4; i++) {
 			d = direction(d);
 			
 			int nx = x + dx[d];
 			int ny = y + dy[d];
 			
 			if(!check[nx][ny] && map[nx][ny] == 0) {
 				clean(nx, ny, d);
 				flag = true;
 				break;
 				
 				
 			}
 		
 		}
 		if(!flag) {
 			int nx = x - dx[d];
 			int ny = y - dy[d];
 			
 			if(map[nx][ny]==0)
 			clean (nx, ny ,d);
 		}
 		
 		
 	}
 	
 	static int direction(int num) {
 		if(num == 0) return 3;
 		else if(num == 1) return 0;
 		else if(num == 2) return 1;
 		else return 2;
 	}

}
