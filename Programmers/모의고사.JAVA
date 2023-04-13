import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] count = new int [3];
        int [] one = {1,2,3,4,5};
        int [] two = {2,1,2,3,2,4,2,5};
        int [] thr = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==one[i%5]) count[0]++;
            if(answers[i]==two[i%8]) count[1]++;
            if(answers[i]==thr[i%10]) count[2]++;
        }
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        
        List <Integer> list = new ArrayList<>();
        
        for(int i=0; i<3; i++){
            if(max==count[i]) list.add(i+1);
        }
      
        int [] answer = new int [list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}