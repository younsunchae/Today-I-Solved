import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt=N;
		for (int i=0; i<N; i++) {
			String temp= sc.next();
			char [] chars = new char[temp.length()];
			boolean [] check = new boolean [26];
			chars = temp.toCharArray();
	
			check[chars[0]-'a'] = true;
			for(int j=1; j<chars.length; j++) {
				
				if(!check[chars[j]-'a']) {
					check[chars[j]-'a']= true;
				}
				else {
					if(chars[j]!=chars[j-1]) {
				
					cnt--;
					break;
					}
				}
				
				
			}
			
			}
		System.out.println(cnt);
	}

}
