import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N = N - N % 100;
        int F = sc.nextInt();
        while (true) {
            if (N % F == 0) {
                System.out.printf("%02d", N % 100);
                break;
            } else {
                N++;
            }
        }
    }
}
