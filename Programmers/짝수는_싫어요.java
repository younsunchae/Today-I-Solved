class Solution {
    public int[] solution(int n) {
        int size = 0;
        if (n % 2 == 0)
            size = n / 2;
        else
            size = n / 2 + 1;
        int[] answer = new int[size];
        int j = 0;
        for (int i = 1; i <= n; i = i + 2) {
            answer[j] = i;
            j++;
        }
        return answer;
    }
}