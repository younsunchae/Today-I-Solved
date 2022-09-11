
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int [] chars = new int [n+1];
		for (int i=2; i<=n; i++) {
			if(chars[i]==0) {
				ans++;
				for (int j=i; j<=n; j=j+i) {
					chars[j]=1;
				}
			
			}
		}
		System.out.println(ans);
	}

}
