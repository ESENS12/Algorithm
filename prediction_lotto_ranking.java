// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/77484
// 규칙 찾기

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int win_count = 0; // 맞춘 갯수
        int zero_count = 0; // 0의 갯수
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero_count +=1;
            }else{
                for(int j=0; j<win_nums.length; j++){
                    if(win_nums[j] == lottos[i]){
                        win_count += 1;
                        break;
                    }
                }
            }
        }

        int max_ranking = (6-(win_count+zero_count) +1);
        int min_ranking = ((6-win_count) +1);
        
        if(min_ranking > 6){
            min_ranking = 6;
        }
        if (max_ranking > 6) {
            max_ranking = 6;
        }
        
        answer[0] = max_ranking;
        answer[1] = min_ranking;
        return answer;
    }
}