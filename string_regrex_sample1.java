//문제출처 : https://programmers.co.kr/learn/courses/30/lessons/72410

import java.util.regex.Pattern;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z\\d\\-_.]*", "");
        answer = answer.replaceAll("\\.{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        if(answer.length() == 0){
            answer = "a";
        }
        
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("[.]$", "");
        
        if(answer.length()<=2){
            char last = answer.toCharArray()[answer.toCharArray().length-1];
            while(answer.length() != 3){
                answer += last;
            }
        }
        println(answer);
        return answer;
    }
    
    public void println(String str){
        System.out.println(str);
    }
}