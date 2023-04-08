import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] ch = s.toCharArray();

        for (int i = 1; i < N; i++) {

            String s1 = br.readLine();
            char[] cch = s1.toCharArray();

            for (int j = 0; j < s.length(); j++) {
                if (ch[j] != cch[j]) {
                    ch[j] = '?';
                }

            }

        }
        for (char x : ch) {
            System.out.print(x);
        }

    }

}
