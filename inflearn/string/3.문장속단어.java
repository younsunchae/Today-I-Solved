package String;

import java.util.Scanner;

public class 문장속단어 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int max = Integer.MIN_VALUE;
		
		String [] s = str.split(" ");
		String answer= "";
		
		for(String x : s) {
			int len = x.length();
			if(len > max) {
				max=len;
				answer = x;
			}
		}
		System.out.println(answer);
		

	}

}
