/**
* 아직 테스트케이스 전부 통과하지 못함.
*
*/

private int solution(int bl, int tot_we, int[] trucks){

        if(trucks.length <= 0 ){
            return 0;
        }

        int result = 0;
        Queue<Integer> bridge_queue = new LinkedList<>();
        Queue<Integer> truck_queue = new LinkedList<>();
        int bridge_weight = 0;
        for(int i=0; i<= bl; i++){
            bridge_queue.add(0);
        }

        for(int item : trucks){
            truck_queue.add(item);
        }

        while(truck_queue.peek() != null){
            result++;
            int weight = bridge_queue.poll();

            int truck_weight = truck_queue.peek();
            bridge_weight = bridge_weight - weight;

            if(tot_we >= (bridge_weight + truck_weight)){

                bridge_queue.add(truck_queue.poll());
                bridge_weight = bridge_weight + truck_weight;
            }else{
                bridge_queue.add(0);
            }
        }
        return result;
    }

