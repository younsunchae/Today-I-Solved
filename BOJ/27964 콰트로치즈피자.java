import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set <String> set = new HashSet<>();
		boolean flag = false;
		for(int i=0; i<N; i++) {
			String word = sc.next();
		
			if(word.endsWith("Cheese")) {
				set.add(word);
			}
			if(set.size()>=4) {
				flag = true;
				break;
			}
		}
		
		System.out.println(flag ? "yummy" : "sad" );
		

	}

}
