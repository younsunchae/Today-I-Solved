import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Pos implements Comparable<Pos> {

    public int x, y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pos o) {
        if (this.y == o.y) {
            return this.x - o.x;
        } else
            return this.y - o.y;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Pos> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list.add(new Pos(x, y));
        }
        Collections.sort(list);

        for (Pos p : list) {
            System.out.println(p.x + " " + p.y);
        }

    }

}
