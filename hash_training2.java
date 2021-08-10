// 내가 풀이한 답 (그냥 해시맵만 쓸줄 알았지...)
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            // 중복되는 key가 있으면 가중치+1
            if(hm.containsKey(clothes[i][1])){
                hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
                continue;
            }
            hm.put(clothes[i][1], 2);
        }
        
        for(int value : hm.values()){
            answer = answer * value;
        }
        
        answer -= 1;
        return answer;
    }
}


// Best Answer 
import java.util.*;
import static java.util.stream.Collectors.*;

class Solution {
    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
}
