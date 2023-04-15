import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> ans = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '.') {
                    String key = s.substring(j + 1);
                    if (ans.get(key) == null) {
                        ans.put(key, 1);
                    } else
                        ans.put(key, ans.get(key) + 1);

                }
            }
        }
        for (Map.Entry<String, Integer> x : ans.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }

    }

}
