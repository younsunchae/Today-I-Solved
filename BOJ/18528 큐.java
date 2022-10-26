package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_18258_큐2 {

	public static void main(String[] args) throws IOException {
		
		LinkedList <Integer> q = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =  Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String str = st.nextToken();
			
			if(str.equals("push")) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			else if(str.equals("front")) {
				if(!q.isEmpty()) {
					sb.append(q.element()+"\n");
				}
				else {
					sb.append("-1\n");
				}
				
			}
			else if(str.equals("pop")) {
				if(!q.isEmpty()) {
					sb.append(q.poll()+"\n");
				}
				else {
					sb.append("-1\n");
				}
				
			}
			else if(str.equals("size")) {
				sb.append(q.size()+"\n");
				
			}
			else if(str.equals("empty")) {
				if(q.isEmpty()) {
					sb.append("1\n");
				}
				else {
					sb.append("0\n");
				}
				
			}
			else {
				if(!q.isEmpty()) {
					sb.append(q.get(q.size()-1)+"\n");
				}
				else {
					sb.append("-1\n");
				}
				
			}
		}
		
		System.out.println(sb);

	}

}
