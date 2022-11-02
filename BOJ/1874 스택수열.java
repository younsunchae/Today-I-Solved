import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder ();
		int N = sc.nextInt();
		
		int start = 0;
		
		for (int i=0; i<N; i++) {
			int in = sc.nextInt();
			if(in > start) {
				for (int j=start+1; j<=in; j++) {
					st.push(j);
					sb.append("+\n");
				}
				start=in;
				
			}else {
				if(st.peek()!=in) {
					System.out.println("NO");
					return;
				}
			}
			st.pop();
			sb.append("-\n");
		
			
		}
		System.out.println(sb);

	}

}
