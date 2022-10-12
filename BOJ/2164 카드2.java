import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		Queue <Integer> q = new LinkedList<>();
		
		for (int i=1; i<=N; i++) {
			q.add(i);
		}
		while(true) {
			if(q.size()==1) {
				break;
			}
			else {
				q.poll();
				q.add(q.poll());
			}
		}
		System.out.println(q.peek());
		

	}

}
