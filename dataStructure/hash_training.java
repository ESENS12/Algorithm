/**
*   문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42577#
*
*/

import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String number : phone_book){
          hm.put(number, 0);  
        } 
        
        for(String item : hm.keySet()){
            for (int j = 1; j <= item.length() - 1; j++){
                if (hm.containsKey(item.substring(0, j))){
                    return  false;
                }
            }
        }

        return true;
    }
}
