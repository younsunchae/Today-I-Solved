import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> st = new Stack<>();
		
		for (int i=0;i<N;i++) {
			String str = sc.next();
			
			if(str.equals("push")) {
				st.push(sc.nextInt());
				
			}
			else if(str.equals("pop")) {
				if(!st.isEmpty()) {
					sb.append(st.pop()+"\n");
				}
				else {
					sb.append("-1\n");
				}
			}
			else if(str.equals("size")) {
				sb.append(st.size()+"\n");
			}
			else if(str.equals("empty")) {
				if(!st.isEmpty()) {
					sb.append("0\n");
					
				}
				else sb.append("1\n");
			}
			else {
				if(!st.isEmpty()) {
					sb.append(st.peek()+"\n");
				}
				else sb.append("-1\n");
			}
		}
		System.out.println(sb);

	}

}
