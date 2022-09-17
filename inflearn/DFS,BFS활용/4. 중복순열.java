import java.util.Scanner;

public class Main {
	
	static int[] pm;
	static int N, M;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //구슬 수
		M = sc.nextInt(); //M번 뽑음
		pm = new int [M];
		DFS(0);
		
		

	}
	
	public static void DFS(int L) {
		if(L==M) {
			for (int x : pm) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i=1; i<=N; i++) {
				pm[L]=i;
				DFS(L+1);
				}
		}
	}

}
