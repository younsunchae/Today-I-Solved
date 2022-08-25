package String;

import java.util.Scanner;

public class  {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char [] chars = str.toCharArray();
		int leftIndex = 0;
		int rightIndex = str.length()-1;
		
		String ans = "";
		while(leftIndex < rightIndex) {
			if(!Character.isAlphabetic(chars[leftIndex])) {
				leftIndex++;
			}
			else if(!Character.isAlphabetic(chars[rightIndex])) rightIndex--;
			
			else {
				char tmp= chars[leftIndex];
				chars[leftIndex] = chars[rightIndex];
				chars[rightIndex] = tmp;
				leftIndex++;
				rightIndex--;
			}
			
			ans = String.valueOf(chars);
		}
		
	
			
		System.out.println(ans);
		

	}

}
