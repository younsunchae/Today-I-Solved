
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int increase = 0;
		int decrease = 0;
		
		int N = sc.nextInt();
		String [] list = new String [N];
		
		for(int i=0; i<N; i++) {
			list[i] = sc.next();
		}
		String [] sort = list.clone();
		String [] reverse = list.clone();
		
		Arrays.sort(sort, (s1, s2) -> s1.compareTo(s2));
		Arrays.sort(reverse, (s1, s2) -> s2.compareTo(s1));
		for(int i=0; i<N; i++) {
			if(list[i].equals(sort[i])) {
				increase++;
			}
			if(list[i].equals(reverse[i])) {
				decrease++;
			}
		
		}
		if(increase==N) {
			System.out.println("INCREASING");
		}
		else if(decrease==N) {
			System.out.println("DECREASING");
		}
		else {
			System.out.println("NEITHER");
		}
		
	}

}
