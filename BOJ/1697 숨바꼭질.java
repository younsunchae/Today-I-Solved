import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N, K;
	static int[] check;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		check = new int [100001];
		if(N == K) System.out.println(0);
		else BFS(N);
		
		
		
	}
	
	
public static void BFS (int n){
	Queue<Integer> q = new LinkedList<>();
	q.add(n);
	check[n] = 1;
	
	while(!q.isEmpty()) {
		int x = q.poll();
		
		
		for (int i=0; i<3; i++) {
			int next;
			
			
			if(i==0) {
				next = x-1;
			}
			else if(i==1) {
				next= x+1;
			}
			else {
				next = x * 2;
			}
			if(next == K) {
				System.out.println(check[x]);
				return;
			}
			
			if(next>=0 && next<100001 && check[next]==0 ) {
				q.offer(next);
				check[next] = check[x] + 1;
				
 			}
			
		}
	}
	
		
	}
}
