import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static int N;
	static int [][] map;
	static int []dx = {0,0,-1,1};
	static int []dy = {1,-1,0,0};
	static int cnt;
	static boolean[][] check;
	static ArrayList<Integer> ans = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		map = new int[N][N];
		check = new boolean[N][N];

		
		for (int i=0; i<N; i++) {
			String tmp = sc.next();
			for (int j=0; j<N; j++) {
				map[i][j] = tmp.charAt(j)-'0';
				
			}
			
		}
		for (int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==1 && !check[i][j]) {
					cnt=1;
					dfs(i,j);
					ans.add(cnt);
				}
			}
		}
		Collections.sort(ans);
		System.out.println(ans.size());
		for ( int x : ans) {
			System.out.println(x);
		}
		
		
	}
	
	public static int  dfs (int i, int j) {
		check[i][j] = true;
		
		for (int d=0; d<4; d++) {
			int x = i + dx[d];
			int y = j + dy[d];
			
			if(x>=0 && y>=0 && x<N && y<N) {
				if(map[x][y]==1 && !check[x][y]) {
					dfs(x,y);
					cnt++;
				}
			}
		}
		
		
		return cnt;
	}
}
