class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length();
        if (s.length() % 2 == 0) {
            answer += s.charAt(size / 2 - 1);
            answer += s.charAt(size / 2);
        } else {
            answer += s.charAt(size / 2);
        }
        return answer;
    }
}