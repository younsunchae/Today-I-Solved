import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int count = 0;
		int s = 64;
		
		while(true) {
			
			if(X ==0 ) break;
			
			if(s > X) s/=2;
			else {
				count++;
				X-=s;
			}
			
			
		}
		System.out.println(count);

	}

}
