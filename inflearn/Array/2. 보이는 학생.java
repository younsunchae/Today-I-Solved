import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = 1;
		int max = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>max){
				ans++;
				max=arr[i];
			}
		}
		System.out.println(ans);

	}

}
