//문제출처 : https://programmers.co.kr/learn/courses/30/lessons/42889#

import java.lang.Double;
import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] clear_users = new int[N];
        Stage[] stage_arr = new Stage[N];
        
        // 각 스테이지별 성공/실패율은 , 
        // 각 스테이지 idx보다 큰 사람의 수(성공), 
        // 전체인원 - 스테이지 idx 보다 작은사람의 수(이전 레벨에서 give up) = 시도한사람
    
        for(int i=0; i<N; i++){
            // i번째 스테이지
            int try_user_num = 0; // i와 같은 수 = try 중이므로 실패
            int drop_user_num = 0; // i보다 작은수 = 이전에 drop된 유저수
            int success_user_num = 0; // i보다 큰 수 = 성공자 
            for(int j=0; j<stages.length; j++){
                if(i == stages[j]-1 ){
                    try_user_num +=1;
                }
                if(i < stages[j] -1 || stages[j]-1 == N){
                    success_user_num +=1;
                }
                if(i > stages[j] -1){
                    drop_user_num +=1;
                }
            }
            double percent = 0.0;
            
            if(success_user_num == 0 || (try_user_num+success_user_num) == 0){
                percent = 0;
            }else{
                percent = (double)(success_user_num) / (try_user_num + success_user_num);    
            }
        
            // println(i+"번째 스테이지 try user : " + try_user_num);
            // println(i+"번째 스테이지 success user : " + success_user_num);
            // println(i+"번째 스테이지 drop user : " + drop_user_num);
            // println(i+"번째 스테이지 실패율 : " + (1-percent));
            // println("");
            
            // 도달한 유저가 없는경우 실패율을 0 으로 해준다
            if(drop_user_num == stages.length){
                stage_arr[i] = new Stage(i, 0); 
            }else{
                stage_arr[i] = new Stage(i, 1-percent);    
            }
        }
        
        Arrays.sort(stage_arr);
        
        int idx=0;
        for(Stage stage : stage_arr){
            // println("idx : " + (stage.idx+1) + ", percent : " + stage.percent);
            answer[idx++] = stage.idx+1;
        }
        return answer;
    }
    
    public void println(String str){
        System.out.println(str);
    }
    
    class Stage implements Comparable<Stage>{
        
        int idx;
        double percent;

        public Stage(int idx, double percent){
            this.idx = idx;
            this.percent = percent; 
        }
        @Override
        public int compareTo(Stage s){
            double r = Double.valueOf(this.percent).compareTo(s.percent)*-1;
            if(r == 0 ) r = this.percent - s.percent;
            return (int)r;
        }
    }
}
