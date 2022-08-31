//메서드를 활용해서 풀기
package String;

import java.util.Scanner;

public class 숫자추출2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String ans = "";
		for (char x : str.toCharArray() ) {
			//x가 숫자냐
			if(Character.isDigit(x)) ans +=x;
			
		}
		
		System.out.println(Integer.parseInt(ans));
		

	}

}
----------------------------------------------------------------------------------------------------------------------------------------
  //아스키 코드를 활용해서 풀기
  package String;

import java.util.Scanner;

public class 숫자추출 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int ans = 0;
		for (char x : str.toCharArray() ) {
			if(x>=48 && x<= 57) ans = ans * 10 + (x-48);
		}
		
		System.out.println(ans);
		

	}

}
