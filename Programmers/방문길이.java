import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        HashSet<String> hs = new HashSet<>();
        int x = 0, y = 0, dx = 0, dy = 0;

        for (int i = 0; i < dirs.length(); i++) {
            dy = y;
            dx = x;

            if (dirs.charAt(i) == 'U' && y < 5) {
                dy++;
                hs.add(x + " " + y + " " + dx + " " + dy);
                hs.add(dx + " " + dy + " " + x + " " + y);
                y = dy;

            } else if (dirs.charAt(i) == 'D' && y > -5) {
                dy--;
                hs.add(x + " " + y + " " + dx + " " + dy);
                hs.add(dx + " " + dy + " " + x + " " + y);
                y = dy;
            } else if (dirs.charAt(i) == 'R' && x < 5) {
                dx++;
                hs.add(x + " " + y + " " + dx + " " + dy);
                hs.add(dx + " " + dy + " " + x + " " + y);
                x = dx;
            } else if (dirs.charAt(i) == 'L' && x > -5) {
                dx--;
                hs.add(x + " " + y + " " + dx + " " + dy);
                hs.add(dx + " " + dy + " " + x + " " + y);
                x = dx;
            }
        }
        answer = hs.size() / 2;
        System.out.println(answer);
        return answer;

    }
}