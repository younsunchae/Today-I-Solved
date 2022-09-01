
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String ans = "";
		str = str + " ";
		int cnt = 1;
		for (int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) cnt++;
			else {
				ans += str.charAt(i);
				if(cnt>1) ans+=String.valueOf(cnt);
				cnt = 1;
			}
		}
		System.out.println(ans);
	}

}
