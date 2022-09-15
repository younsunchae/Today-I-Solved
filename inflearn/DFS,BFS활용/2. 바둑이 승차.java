package DFS;

import java.util.Scanner;

public class 바둑이승차 {
	static int ans = Integer.MIN_VALUE;
	static int n,c;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt(); //태울 수 있는 최대 킬로그램
		n = sc.nextInt(); //바둑이 마리 수
		int [] arr = new int [n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		DFS(0,0,arr);
		System.out.println(ans);

	}
	
	public static void DFS(int L, int sum, int[] arr ) {
		//바둑이들의 무게가 제한 무게보다 크다면 리턴
		if(sum>c) return;
		//부분집합 하나가 완성되면
		if(L==n) {
			ans = Math.max(ans,sum);
			
		}else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		
	}

}
