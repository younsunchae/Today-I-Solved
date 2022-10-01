import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] belt = new int[N*2];
		boolean[] check = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N*2; i++) {
			belt[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		
		while(true) {
			cnt++;
			
			//1
			int temp = belt[N*2-1];
			for (int i = N*2-1; i > 0; i--) {
				belt[i] = belt[i-1];
			}
			belt[0] = temp;

			for (int i = N-1; i > 0; i--) {
				check[i] =check[i-1];
			}
			
			check[0] = false;
			check[N-1] = false;
			
			//2
			for (int i = N-1; i > 0; i--) {
				if(check[i-1] && !check[i] && belt[i]>0) {
					
					belt[i]--;
					check[N-1] = false;
					check[i-1] = false;
					check[i] = true;
				}
			}
			
			//3
			if(belt[0]>0) {
				check[0] = true;
				belt[0]--;
			}
			
			//4
			int zero = 0;
			for (int i = 0; i < N*2; i++) {
				if(belt[i] == 0) 
					zero++;
				if(zero==K) {
					System.out.println(cnt);
					return;
				}
			}
			
		
		}
		
		
	}
	
}

