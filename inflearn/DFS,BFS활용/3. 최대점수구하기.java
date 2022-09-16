
import java.util.Scanner;

public class Main {

	static int N,M;
	static int ans = Integer.MIN_VALUE;
	boolean flag = false;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();//문제의 개수
		M = sc.nextInt();//제한 시간
		
		int [] score = new int [N];
		int [] limitTime = new int [N];
		
		for (int i=0; i<N; i++) {
			score[i] = sc.nextInt();
			limitTime[i] = sc.nextInt();
		}
		DFS(0,0,0,score, limitTime);
		System.out.println(ans);

	}
	
	static void DFS (int L, int sum, int time, int []ps, int []pt  ) {
		if(time>M) return;
		if(L==N) {
			ans = Math.max(ans, sum);
			
		}
		else {
			DFS(L+1, sum+ps[L], time+pt[L], ps ,pt);
			DFS(L+1, sum, time, ps ,pt);
			
		}
	}

}
