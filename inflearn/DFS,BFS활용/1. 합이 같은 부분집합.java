import java.util.Scanner;

public class Main {

	
	static boolean check = false;
	static String ans = "NO";
	static int n;
	static int total=0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int [] arr = new int[n];
	
		
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			total+=arr[i];
			
		}
		DFS(0,0,arr);
		System.out.println(ans);
		
		
	}
	public static void DFS (int L, int sum,int [] arr) {
		if(check) return;
		if(sum>total/2) return;
		if(L==n) {
			if((total-sum)==sum) {
				ans = "YES";
				check = true;
			}
		}
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		
	}
	


}
