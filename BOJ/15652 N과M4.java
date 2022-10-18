import java.util.Scanner;

public class Main {
	static int N ,M;
	static int []arr;
	static boolean [] check;
	static StringBuilder sb;
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();
		
		N = sc.nextInt();
		M =sc.nextInt();
		
		arr= new int[M];
		check = new boolean[N+1];
		
		dfs(1,0);
		System.out.println(sb);
	}

	private static void dfs(int start, int cnt) {
		// TODO Auto-generated method stub
		
		if(cnt==M) {
			for (int x : arr) {
				sb.append(x+" ");
			}
			sb.append("\n");
			return;
		}
	
		for (int i=1;i<=N; i++) {
			if(start<=i) {
				arr[cnt]=i;
				dfs(arr[cnt], cnt+1);
				
			}

		
				
				
			
		
			
			
			}
				
			
			
		
	}

}
