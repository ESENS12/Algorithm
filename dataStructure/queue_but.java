// 분명 queue 문제였지만 배열로 제출 근데 이제 리스트를 곁들인

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //작업속도에 비례하는 남은 작업일자를 담아두는 배열
        int[] temp = new int[progresses.length];
        
        //정답 개수를 담아 두기 위한 array (사이즈를 아직 모르므로)
        ArrayList<Integer> arrays = new ArrayList<>();
        
        //우선 작업속도와 progress로 남은 작업일자 remain을 구한다.
        for (int i=0; i<speeds.length; i++){
           // int date = (int) Math.ceil(remain); 한줄이면 아래 난리를 치지 않았어도 되는것을
            int remain = 100 - progresses[i];    
            temp[i] = (remain / speeds[i]);
            if(remain % speeds[i] >0){
                temp[i] = temp[i] + 1;
            }
        }
        
        int target_day = temp[0];   // 배포까지 남은 날
        int release_num = 1;        // 해당 일에 배포되는 작업의 개수
        
        for (int i=1; i<temp.length; i++){
            if(target_day >= temp[i]){      // 이전 작업의 남은 작업일 >= 현재 작업의 남은 작업일
                release_num +=1;            // 이전작업 배포날 같이 배포 할 수 있으므로 +1
            }else{
                arrays.add(release_num);    // 그렇지 않다면 리스트에 배포개수를 추가해주고 변수초기화
                release_num = 1;
                target_day = temp[i];
            }
        }
        
        arrays.add(release_num);    // 마지막 작업의 배포개수 추가
        int[] answer = new int[arrays.size()];

        for(int i=0; i<arrays.size(); i++){
            answer[i] = arrays.get(i);
        }
        
        return answer;
    }
}




// 아래는 진짜 queue로 푼 정답

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && q.peek() < date) {
                answerList.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
