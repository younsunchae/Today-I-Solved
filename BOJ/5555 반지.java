import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ring= sc.next();
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            s+=s;
            if (s.contains(ring)) {
                count++;
            }
        }
        System.out.println(count);
       
    }
}
