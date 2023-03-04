import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  String s = br.readLine();
		  String t = br.readLine();
		  
		  System.out.println(dfs(s,t));

	}

	private static int dfs(String S, String T) {
		if(S.length() == T.length()) {
			if(S.equals(T)) {
				return 1;
			}
			return 0;
		}
		
		int ans = 0;
		
		if(T.charAt(T.length()-1) == 'A') {
			ans += dfs(S, T.substring(0, T.length()-1));
		}
		if(T.charAt(0)=='B') {
			String str = T.substring(1);
			StringBuilder reverse = new StringBuilder(str);
			String string = reverse.reverse().toString();
			ans+=dfs(S, string);
		}
		return ans==0 ? 0 : 1 ;
		
		
	}

}
