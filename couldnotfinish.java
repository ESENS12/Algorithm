/**
*  문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42576
**/
//아마도(?) 출제자가 의도한 풀이[대부분 이렇게 풀었음] - HashMap 사용

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}


//--------------------------------------------------------------------------------------------------------


// 나의 풀이 ..
import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for(String item : completion){
            if(!participant[i].equals(item)){
                return participant[i];
            }
            i++;
        }
        answer = participant[participant.length-1];
        return answer;
    }
}
