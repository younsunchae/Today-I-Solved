import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main{
	
	static int N,M;
	static int [][] map;
	static boolean [] isOpen;
	static ArrayList<Pos> home;
	static ArrayList<Pos> gage;
	static int ans;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer (br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken()); //남겨야할 치킨집 개수
		map = new int [N][N];
		home = new ArrayList<>();
		gage = new ArrayList<>();
		
		
		ans = Integer.MAX_VALUE;
		
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(map[i][j]==1) {
					home.add(new Pos(i,j));
					
				}
				else if(map[i][j]==2) {
					gage.add(new Pos(i,j));
					
				}
		
				
			}
		}
	
		isOpen = new boolean[gage.size()];
		
	
	
		comb(0,0);
		
		System.out.println(ans);
		

	}
	private static void comb(int cnt, int start) {
		if(cnt==M) {
			int total=0;
			for (int i=0; i<home.size(); i++) {
				int min = Integer.MAX_VALUE;
				
				for (int j=0; j<gage.size(); j++) {
					if(isOpen[j]) {
						int dis = Math.abs(home.get(i).x - gage.get(j).x) + Math.abs(home.get(i).y - gage.get(j).y);
						
						min = Math.min(min, dis);
					
					}
				}
				total += min;
			}
			ans = Math.min(total, ans);
			return;
		}
		for (int i=start; i<gage.size(); i++) {
			isOpen[i] = true;
			comb(cnt+1, i+1);
			isOpen[i] = false;
		}
		
	}
	static class Pos {
		int x, y;

		public Pos(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		
	}

}
