// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42746#
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i< numbers.length; i++){
            arr.add(numbers[i]);
        }

        Collections.sort(arr, (num1, num2) -> {
            String left = String.valueOf(num1);
            String right = String.valueOf(num2);
            // a<b 이면 -1 , a==b 이면 0, a>b 이면 1 
            return -Integer.compare(Integer.parseInt(left+right) , Integer.parseInt(right+left));
        });

        StringBuilder sb = new StringBuilder();
        for(Integer i : arr){
            sb.append(i);
        }

        answer = sb.toString();
        if(answer.charAt(0) == '0'){
            return "0";
        }else{
            return answer;
        }
    }
}