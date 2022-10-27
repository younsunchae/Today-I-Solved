class Solution {
    public int[] solution(int brown, int yellow) {
        int total = yellow + brown;
         int[] answer = new int [2];
        for (int i=1; i<=total; i++){
            int row = i;
            int col = total/i;
            
            if(row >= col && (row * 2 + (col-2)* 2) == brown) {
                answer[0] = row;
                answer[1] = col;
               break;
            }
        }
        return answer;
       

    }
}