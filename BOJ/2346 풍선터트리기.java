import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		Deque<int []> q = new ArrayDeque<>();
		
		int [] arr = new int [N];
		
		sb.append(1 + " ");
		
		for (int i= 0; i<N;i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int ball = arr[0];
		
		for (int i=1; i<N;i++) {
			q.add(new int [] {(i+1), arr[i]});
		}
		while(!q.isEmpty()) {
			if(ball>0) {
				for(int i =1; i<ball; i++) {
					q.add(q.poll());
				}
				int [] next = q.poll();
				ball = next[1];
				sb.append(next[0]+" ");
			}
			
			else {
				for(int i =1; i<-ball; i++) {
					q.addFirst(q.pollLast());
				}
				int [] next = q.pollLast();
				ball = next[1];
				sb.append(next[0]+" ");
				
			}
		}
		System.out.println(sb);
		
		
		
		

	}

}
