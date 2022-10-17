import java.util.Scanner;

public class Main {
	
	static int N, M;
	static int [] arr;
	static StringBuilder sb;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int [M];
		
		dfs(0);
		System.out.println(sb);
	}

	private static void dfs(int cnt) {
		
		if(cnt == M) {
			for (int x : arr) {
				sb.append(x + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i=1; i<=N; i++) {
			
			arr[cnt] = i;
			dfs(cnt+1);
				
			
		}
		
	}
	

}
