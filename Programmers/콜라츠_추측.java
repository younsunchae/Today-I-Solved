class Solution {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        while (true) {
            if (num == 1) {
                answer = count;
                break;
            } else {
                count++;
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num * 3 + 1;
                }

            }

            if (count == 500) {
                answer = -1;
                break;
            }

        }

        return answer;
    }
}