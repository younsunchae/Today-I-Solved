class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        String answer = "";
        int days = b-1;
        int [] m = {31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i =0; i<a-1; i++){
            days += m[i];
        }
        days %= 7;
        answer = day[days];
        return answer;
    }
}