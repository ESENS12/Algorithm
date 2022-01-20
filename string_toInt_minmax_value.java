// 문제출처 : https://programmers.co.kr/learn/courses/30/lessons/12939?language=java
// 문자열 파싱(to integer) 후 최대값, 최소값 출력 하기

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s){
        ArrayList<Integer> arr_int = new ArrayList<>();
        int after_idx = 0;

        while(true){
            if(!s.contains(" ")){
                arr_int.add(Integer.parseInt(s));
                break;
            }
            after_idx = s.indexOf(" ");
            if(after_idx <= 0){
                // err
                break;
            }
            String str_number = s.substring(0, after_idx);
            arr_int.add(Integer.parseInt(str_number));

            after_idx +=1;
            s = s.substring(after_idx);
        }
        
        String str_max = Collections.max(arr_int).toString();
        String str_min = Collections.min(arr_int).toString();
        return str_min + " " + str_max;
    }
}