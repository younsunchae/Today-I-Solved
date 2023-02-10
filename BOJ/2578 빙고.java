import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int count = 0;
    static int[][] board;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        board = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 25; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (board[j][k] == n) {
                        board[j][k] = -1;
                    }
                }
            }
            row();
            column();
            cRight();
            cLeft();

            if (count >= 3) {
                System.out.println(i + 1);

                break;
            }
            count = 0;

        }

    }

    private static void cLeft() {
        int ccount = 0;
        for (int i = 0; i < 5; i++) {
            if (board[i][4 - i] == -1)
                ccount++;

        }
        if (ccount == 5)
            count++;
    }

    private static void cRight() {
        int ccount = 0;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] == -1)
                ccount++;

        }
        if (ccount == 5)
            count++;

    }

    // 열검사
    private static void column() {
        for (int i = 0; i < 5; i++) {
            int ccount = 0;
            for (int j = 0; j < 5; j++) {
                if (board[j][i] == -1)
                    ccount++;
            }
            if (ccount == 5)
                count++;
        }

    }

    // 행검사
    private static void row() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 5; i++) {
            int ccount = 0;
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == -1)
                    ccount++;
            }
            if (ccount == 5)
                count++;
        }

    }

}
