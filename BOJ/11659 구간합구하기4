import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		
		long [] nums = new long[N+1];
		long [] ans = new long [M];
		 st = new StringTokenizer(br.readLine());
		for (int i=1; i<=N;i++) {
			nums[0] = 0;
			nums[i] = nums[i-1] + Integer.parseInt(st.nextToken());
		}
		 
		for (int i=0; i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(nums[b] - nums[a-1]).append("\n");
			
			
			
			
			
			
		}
		System.out.println(sb);

	}

}
