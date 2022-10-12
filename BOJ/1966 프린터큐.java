import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int t=0; t<tc; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			LinkedList <int []> q = new LinkedList<>();
			
			for (int i= 0; i<N; i++) {
				q.offer(new int[] { i, sc.nextInt() });
			}
			
			int ans = 0;
			
			while(!q.isEmpty()) {
				
				boolean check = false;
				int [] cur = q.poll();

				for (int i=0; i<q.size(); i++) {
					if(cur[1]< q.get(i)[1]) {
						q.offer(cur);
						for(int j=0; j<i; j++) {
							
							q.offer(q.poll());
							
						}
						
						check = true;
						break;
					}
					
				
				}

				if(check) {
					continue;

					}
				ans++;
				
				if(cur[0]==M) break;
				
				
				
			}
			System.out.println(ans);
		}
	}
	


}
