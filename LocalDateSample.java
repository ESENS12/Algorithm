// 문제출처 : https://programmers.co.kr/learn/courses/30/lessons/12901
import java.time.LocalDate;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate ofDate = LocalDate.of(2016, a, b);
        ofDate.getDayOfWeek();
        answer = ofDate.getDayOfWeek().toString().substring(0,3);
        return answer;
    }
    public void println(String str){
        System.out.println(str);
    }
}