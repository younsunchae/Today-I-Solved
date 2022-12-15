class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long temp = 0;
        for (int i = 1; i <= count; i++) {
            temp += price * i;
        }

        if (temp > money) {
            answer = temp - money;
        }

        return answer;
    }
}