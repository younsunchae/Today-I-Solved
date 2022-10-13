import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			left.push(str.charAt(i));
		}

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String com = br.readLine();
			if (com.equals("B")) {
				if (!left.empty()) {
					left.pop();
				}
			}
			else if (com.contains("P")) {
				char word = com.charAt(2);
				left.push(word);
			}
			else if (com.equals("D")) {
				if (!right.empty()) {
					left.push(right.pop());

				}
			} 
			
			else if (com.equals("L")) {
				if (!left.empty()) {
					right.push(left.pop());
				}
			} 

		}

		while (!left.empty()) {
			right.push(left.pop());
		}

		while (!right.empty()) {
			//sb.append(right.pop());
			bw.write(right.pop());
		}
		
		//System.out.println(sb);
		bw.flush();

	}

}
