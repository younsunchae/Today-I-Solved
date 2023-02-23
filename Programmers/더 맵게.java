import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        while (true) {
            if (pq.peek() >= K)
                break;

            if (pq.size() == 1 && pq.peek() < K) {
                answer = -1;
                break;
            }

            int a = pq.poll();
            int b = pq.poll();

            pq.add(a + b * 2);

            answer++;
        }

        return answer;
    }
}