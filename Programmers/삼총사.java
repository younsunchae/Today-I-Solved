class Solution {
    static int N;
    static int count = 0;
    static int nums[] = new int[3];
    static int[] stu;

    public int solution(int[] number) {
        N = number.length;
        stu = number;
        comb(0, 0);
        return count;
    }

    private static void comb(int start, int cnt) {
        if (cnt == 3) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += nums[i];
            }
            if (sum == 0) {
                count++;
            }
            return;
        }

        for (int i = start; i < N; i++) {
            nums[cnt] = stu[i];
            comb(i + 1, cnt + 1);
        }
    }
}