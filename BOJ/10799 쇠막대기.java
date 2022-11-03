import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
			String line = sc.next();		
			char [] chars = line.toCharArray();
			
			int n = 0; 
			int sum =0;
			for (int i=0; i<chars.length; i++) {
			
				if(chars[i]=='(') {
					if(chars[i+1]==')') {
						sum+=n*2-n;//sum+=n
						i++;
					}
					else{
						n++;
						sum++;
						
					
					}
				}
				else if (chars[i] ==')') {
					n--;
					
				}
            }
			
			System.out.println(sum);
			
		
		

	}

}