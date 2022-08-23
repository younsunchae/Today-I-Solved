
import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] str = new String[N];
		
		for(int i=0; i<N; i++) {
			str[i] = sc.next();
		}
 		
		ArrayList<String> answer = new ArrayList<>();
		for (String x  :str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		for(String x : answer) {
			System.out.println(x);
		}

	}

}
