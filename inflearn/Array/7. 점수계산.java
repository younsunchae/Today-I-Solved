import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int ans = 0, cnt =0;
		 
		 int n = sc.nextInt();
		 
		 int [] arr = new int[n];
		 for (int i=0; i<n; i++) {
			 arr[i] = sc.nextInt();
			 
		 }
		 for (int i=0; i<n; i++) {
			 if(arr[i] ==1) {
				 cnt++;
				 ans+=cnt;
			 }
			 else cnt=0;
		 }
		 System.out.println(ans);
	}

}
