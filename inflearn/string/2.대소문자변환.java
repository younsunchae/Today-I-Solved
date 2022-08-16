package String;

import java.util.Scanner;

public class 대소문자변환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String answer="";
		
		for (char x : s.toCharArray()) {
			if(Character.isLowerCase(x)) {
				//소문자니?
				answer+=Character.toUpperCase(x);
				
			}
			else {
				answer+=Character.toLowerCase(x);
			}
		}
		System.out.println(answer);
		
	}

}
------------------------------------------------------------------------------------
  package String;

import java.util.Scanner;

public class 대소문자변환_아스키코드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String answer="";
		
		//대문자 65-90
		//소문자 97-122
		
		for (char x : s.toCharArray()) {
			if(x>='a') {
				//소문자니?
				answer+=(char)(x-'a'+'A');
			}
			else {
				answer+=(char)(x-'A'+'a');
			}
		}
		System.out.println(answer);
		
	}

}
