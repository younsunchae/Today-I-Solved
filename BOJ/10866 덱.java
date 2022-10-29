import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Deque<Integer> dq = new ArrayDeque<>();
		int N = sc.nextInt();
		
		
		for(int i=0; i<N; i++) {
			String cm = sc.next();
		

			if(cm.equals("push_back")) {
			
				dq.addLast(sc.nextInt());
			}
		
			else if(cm.equals("push_front")) {
				dq.addFirst(sc.nextInt());
			}
			
			else if(cm.equals("pop_front")){
				if(dq.isEmpty()) {
					sb.append("-1\n");
					
				}
				else sb.append(dq.removeFirst()+"\n");
			}
			
			else if(cm.equals("pop_back")) {
				if(dq.isEmpty()) {
					sb.append("-1\n");
				}
				else sb.append(dq.removeLast()+"\n");
			}
		
			else if(cm.equals("size")) {
				sb.append(dq.size()+"\n");
			}
			
			else if(cm.equals("empty")) {
				if(dq.isEmpty()) {
					sb.append("1\n");
				}
				else {
					sb.append("0\n");
				}
			}
			
			else if(cm.equals("front")) {
				if(dq.isEmpty()) {
					sb.append("-1\n");
				
				}
				else sb.append(dq.getFirst()+"\n");
			}
		
			else if(cm.equals("back")) {
				if(dq.isEmpty()) {
					sb.append("-1\n");		
				}
				else sb.append(dq.getLast()+"\n");
			}
		}
		
		System.out.println(sb);

	}

}
