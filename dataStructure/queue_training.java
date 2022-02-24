// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42587


import java.util.LinkedList; 
import java.util.Queue;
import java.util.Arrays;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        
        int answer = 0;

        for(int i =0 ; i <priorities.length; i++){
            queue.add(priorities[i]);
        }
        
        while(queue.peek() != null){

            int top = queue.poll();
            // 아이템이 출력될 때 마다 사용자 요청 아이템의 위치는 하나씩 앞칸으로 땡겨지므로
            // 만약 0번째가 요청 아이템이라면 -1이 된다.
            location -= 1;
            
            boolean bNeedChange = false;
            //자기자신보다 우선순위가 높은 아이템을 찾는다
            for(int item : queue){
                if(item > top){
                    bNeedChange = true;
                    break;
                }
            }
            
            if(bNeedChange){
                //자기자신보다 우선순위가 높으면 맨 뒤로 보낸다.
                queue.add(top);
                // 만약 지금 맨뒤로 가는 아이템이 자기가 고른 아이템이면 현재위치 변경해줌
                if(location < 0){
                    location = queue.size()-1;
                }
                
            }else{
                answer += 1;
                //자신이 출력되는 경우에 종료
                if(location<0){
                    break;
                }
            }
        }
        
        return answer;
    }
}