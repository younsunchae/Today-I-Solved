import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Points implements Comparable<Points> {

    public int x, y;

    public Points(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Points o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else
            return this.x - o.x;

    }

}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Points> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Points(x, y));
        }

        Collections.sort(list);
        for (Points o : list) {
            System.out.println(o.x + " " + o.y);
        }

    }

}
