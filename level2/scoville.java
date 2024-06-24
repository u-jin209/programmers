package level2;

import java.util.PriorityQueue;

public class scoville {

    public static int solution(int[] scoville, int K) {
        int answer = -1;

        PriorityQueue<Integer> queue = new PriorityQueue<>();


        for(int i : scoville){
            queue.add(i);
        }

        while(queue.peek()  < K){
            System.out.println(queue);
            if(!queue.isEmpty() && queue.size() >=2) {
                int a = queue.poll();
                int b = queue.poll();
                queue.add(a+(b*2));
                answer++;
            }else{
                answer =-1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2},7));
        System.out.println("end");
    }
}
