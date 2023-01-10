class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == ' ') {
                answer += " ";
                idx = 0;
                continue;
            }
            if (idx % 2 == 0) {
                answer += String.valueOf(Character.toUpperCase(s.charAt(i)));
                idx++;
            } else {
                answer += String.valueOf(Character.toLowerCase(s.charAt(i)));
                idx++;
            }
        }
        return answer;
    }
}