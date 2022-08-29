
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();
		String ans = "YES";
		int len = str.length();
		
		for (int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				ans = "NO";
			}
		}
		System.out.println(ans);

	}

}
