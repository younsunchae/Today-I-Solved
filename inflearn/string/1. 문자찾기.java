package String;

import java.util.Scanner;

public class 문자찾기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		char a = sc.next().charAt(0);
		
		input = input.toLowerCase();
		a = Character.toLowerCase(a);
		
		int count =0;
		for (char x : input.toCharArray()) {
			if(x==a) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		

	}

}

-------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class 문자찾기2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		char a = sc.next().charAt(0);
		
		input = input.toLowerCase();
		a = Character.toLowerCase(a);
		
		int count =0;
		for (int i=0; i<input.length(); i++)  {
			if(input.charAt(i)==a) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		

	}

}

