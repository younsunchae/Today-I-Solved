import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ans = "NO";
		String str = sc.nextLine();
		str  = str.toUpperCase().replaceAll("[^A-Z]", "" );
		//알파벳 대문자가 아니면
		
		String tmp = new StringBuilder(str).reverse()
.toString();
		if(str.equals(tmp)) ans = "YES";
		System.out.println(ans);

	}

}
