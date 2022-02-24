// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42583#

public int solution(int bridge_length, int weight, int[] truck_weights){

        if(truck_weights.length <= 0 ){
            return 0;
        }

        int result = 0;
        Queue<Integer> bridge_queue = new LinkedList<>();
        Queue<Integer> truck_queue = new LinkedList<>();
        int bridge_weight = 0;
        for(int i=0; i<= bridge_length; i++){
            bridge_queue.add(0);
        }

        for(int item : truck_weights){
            truck_queue.add(item);
        }

        while(true){
            //when last trucks on the bridge
            if(truck_queue.peek() == null){
                result+=bridge_length;
                break;
            }
            int bl_weight = bridge_queue.poll();
            if(truck_queue.peek() != null){
                int truck_weight = truck_queue.peek();
                bridge_weight = bridge_weight - bl_weight;

                if(weight >= (bridge_weight + truck_weight)) {

                    bridge_queue.add(truck_queue.poll());
                    bridge_weight = bridge_weight + truck_weight;
                }

            }
            result++;
        }
        return result;
    }


/*
*.  다른 사람의 풀이 참조 
**/

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 1;
        Queue<Integer> bridge = new ArrayDeque<>();
        
        for(int i=0; i< bridge_length-1; i++){
            bridge.add(0);
        }
        
        int current_weight = truck_weights[0];
        bridge.add(current_weight);
        
        int index = 1;
        while(!bridge.isEmpty()){
            answer++;
            int truck = bridge.poll();
            current_weight -= truck;
            
            if(index < truck_weights.length){
                if(weight >= current_weight + truck_weights[index]){
                    current_weight += truck_weights[index];
                    bridge.add(truck_weights[index++]);
                }else{
                    bridge.add(0);
                }
            }
        }
        return answer;
    }
}
