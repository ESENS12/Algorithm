
//문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42626

import java.util.PriorityQueue;

public int solution(int[] scoville, int K) {
        int result = 0;
        PriorityQueue<Integer> queue = new PriorityQueue();
        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }
        // 큐에 다 넣어준다음, 가장작은놈이 K보다 크거나 같으면 stop,
        // 아니면 1번째와 2번쨰를 뽑아낸다음 더해서 다시 큐에 넣어주고 다시 체크.. 반복
        while(true){

            if(K <= queue.peek()){
                break;
            }

            result++;

            if(queue.size()<=1){
                return -1;
            }
            int num1 = queue.poll();
            int num2 = queue.poll();
            queue.add(num1 + (num2*2));
        }
        return result;
    }
