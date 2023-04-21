import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        list.add("black");
        list.add("brown");
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        list.add("violet");
        list.add("grey");
        list.add("white");
        int a = list.indexOf(sc.next()) * 10;
        int b = list.indexOf(sc.next());
        long c = list.indexOf(sc.next());
        System.out.println((a + b) * (long) Math.pow(10, c));
    }
}