import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long answer = 1;
        for (int i = 1; i <= N; i++) {
            answer *= i;
            answer %= 1000000000;

            while (answer % 10 == 0) {

                answer /= 10;
            }
        }

        System.out.println(answer % 10);

    }
}
