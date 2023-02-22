import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int size = str.length();

        int cnt = size;

        while (true) {
            String tmp = new StringBuilder(str).reverse().toString();
            if (str.equals(tmp)) {
                break;
            }

            str = str.substring(1);

            cnt++;
            ;
        }
        System.out.println(cnt);

    }
}
