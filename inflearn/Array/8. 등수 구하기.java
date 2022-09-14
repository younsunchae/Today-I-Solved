import java.util.Scanner;

public class  Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		int [] ans = new int [n];
		for (int i=0; i<n; i++) {
			int cnt =1 ;
			for (int j=0; j<n; j++) {
				if(arr[j]>arr[i]) cnt++;
			}
			ans[i] = cnt;
		}
		for (int x : ans) System.out.print(x + " ");

	}

}
