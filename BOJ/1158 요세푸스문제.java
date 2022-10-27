import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue <Integer> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for (int i =1; i<=N; i++) {
			q.add(i);
		}
		StringBuilder sb = new StringBuilder();
		
		sb.append("<");
		
		while(!q.isEmpty()) {
			
			for (int i=0; i<K-1; i++) {
				q.add(q.poll());
			}
			
			
			if(q.size()==1) {
				sb.append(q.poll()).append(">");
				break;
			}
			sb.append(q.poll()).append(", ");
			
			
		}

		System.out.println(sb);

	}

}
