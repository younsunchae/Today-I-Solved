import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		
		int tc = sc.nextInt();
		
		for (int t=0;t<tc;t++) {
			int N = sc.nextInt();
			int cnt = 0;
			
			double avg=0;
			double over;
			
			int [] arr = new int [N];
			
			for (int i=0; i<N; i++) {
				int score = sc.nextInt();
				
				arr[i] = score;
				avg+=score;
				
			}
			avg = avg / N;
			
			for (int i=0; i<N; i++) {
				if(arr[i]>avg) {
					cnt++;
				}
			}
			over = (double) cnt / N * 100;
			
			System.out.printf("%.3f", over);
			System.out.println("%");
			
		}

	}

}
