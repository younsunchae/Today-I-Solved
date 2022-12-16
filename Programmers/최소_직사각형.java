class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int cnt = sizes.length;
        int[] row = new int[cnt];
        int[] col = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            row[i] = Math.max(sizes[i][0], sizes[i][1]);
            col[i] = Math.min(sizes[i][0], sizes[i][1]);

        }
        int r_max = 0;
        int c_max = 0;

        for (int i = 0; i < cnt; i++) {
            if (r_max < row[i]) {
                r_max = row[i];
            }
            if (c_max < col[i]) {
                c_max = col[i];
            }

        }
        answer = r_max * c_max;
        return answer;
    }
}