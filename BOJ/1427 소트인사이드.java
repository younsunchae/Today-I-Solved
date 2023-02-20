import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int N = s.length();
		String [] nums = new String[N];
		
		for (int i =0; i<N; i++) {
			nums[i] = String.valueOf(s.charAt(i));
		}
		Arrays.sort(nums, Collections.reverseOrder());
		
		for (String x : nums) {
			System.out.print(x);
		}
	}

}
