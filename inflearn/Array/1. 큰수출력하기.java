import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			
		}
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(arr[0]);
		for (int i=1;i<n; i++) {
			if(arr[i]>arr[i-1]) {
				ans.add(arr[i]);
			
			}
			
		}
		for (int x : ans) {
			System.out.print(x+" ");
		}

	}

}
