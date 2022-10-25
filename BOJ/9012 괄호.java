import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=0;i<N;i++) {
			String tmp = br.readLine();
			
			Stack <Character> st = new Stack<>();
			
			int cnt = 0;
			for (int j=0; j<tmp.length(); j++) {
				char temp = tmp.charAt(j);
				if(temp=='(') st.push(temp);
				else {
					if(st.isEmpty()) {
						sb.append("NO\n");
						break;
						
					}else {
						st.pop();
					}
				}
				cnt++;
				
			}
			if(cnt==tmp.length() && st.isEmpty()) sb.append("YES\n");
			else if (cnt==tmp.length() && !st.isEmpty())sb.append("NO\n");
			
		}
		
		System.out.println(sb);
	
		
		

	}

}
