
import java.util.Scanner;
 
public class Main {
 
	static int[] arr;
	static int N, M;
	
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int [M];
		
		dfs(1,0);
		
 
	}

	private static void dfs(int start, int cnt) {
		// TODO Auto-generated method stub
		
		if(cnt == M ) {
			for (int x : arr) {
				System.out.print(x +  " ");
			}
			System.out.println();
	 
			return;
		}
		for (int i= start; i<=N; i++) {
			arr[cnt]=i;
			dfs(i+1,cnt+1);
		}
		
	}
 
	
	
}
