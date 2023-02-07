import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int[] chart = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 14; i++) {
            chart[i] = Integer.parseInt(st.nextToken());
        }

        int JHTotal = JH(money, chart);
        int SMTotal = SM(money, chart);

        if (JHTotal > SMTotal)
            System.out.println("BNP");
        else if (JHTotal < SMTotal)
            System.out.println("TIMING");
        else
            System.out.println("SAMESAME");

    }

    private static int JH(int money, int[] chart) {
        int cnt = 0;
        for (int i = 0; i < 14; i++) {
            if (money >= chart[i]) {
                cnt = money / chart[i];
                money = money % chart[i];

            }
        }
        return money + cnt * chart[13];
    }

    private static int SM(int money, int[] chart) {
        int cnt = 0;
        int buyCnt = 0;
        int up = 0;
        int down = 0;

        for (int i = 1; i < 14; i++) {
            if (chart[i - 1] > chart[i]) {
                down++;
                up = 0;
            } else if (chart[i - 1] < chart[i]) {
                up++;
                down = 0;
            } else {
                up = 0;
                down = 0;
            }

            if (up >= 3) {
                money = money + cnt * chart[i];
                cnt = 0;
            } else if (down >= 3 && money >= chart[i]) {
                buyCnt = money / chart[i];
                money = money % (buyCnt * chart[i]);
                cnt += buyCnt;
            }
        }
        return money + cnt * chart[13];
    }

}
