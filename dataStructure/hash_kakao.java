// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42888
// class로 구현했다가, 그냥 다시 hash로.. 

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        HashMap<String, String> hm = new HashMap<>();
        ArrayList<String> historyList = new ArrayList<>(); // 최종출력을 위한 행동 + uid 기록
        
        for(String str : record){
            String doWhat = str.split(" ")[0];
            String uid = str.split(" ")[1];
            if(!doWhat.equals("Leave")){
                String userName = str.split(" ")[2];
                hm.put(uid, userName);
            }
            if(!doWhat.equals("Change")){
                historyList.add(doWhat + "," + uid);    
            }
        }
        answer = new String[historyList.size()];
        int i=0;
        for(String addHistory : historyList){
            String userName = hm.get(addHistory.split(",")[1]);
            switch(addHistory.split(",")[0]){
                case "Enter":{
                    answer[i] = userName+"님이 들어왔습니다.";
                }break;
                case "Leave":{
                    answer[i] = userName+"님이 나갔습니다.";
                }break;
            }
            i++;
        }

        return answer;
    }
    
}
