import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N  = sc.nextInt();
		sc.nextLine();
		double [] arr = new double [N];
		String str = sc.nextLine();
		
		Stack<Double> st = new Stack<>();
		
		for (int i =0;i<N; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		for (int i =0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				st.push(arr[str.charAt(i)-'A']);
			}else {
				double n1 = st.pop();
				double n2 = st.pop();
				
				switch(str.charAt(i)) {
				case '+':
					st.push(n2+n1);
					break;
				case '-':
					st.push(n2-n1);
					break;
				case '*':
					st.push(n2*n1);
					break;
				case '/':
					st.push(n2/n1);
					break;
				}
			}
		}
		
		System.out.println(String.format("%.2f", st.pop()));

	}

}
