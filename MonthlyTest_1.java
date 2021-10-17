//문제출처 : https://programmers.co.kr/learn/courses/30/lessons/86051
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int number : numbers){
            answer -= number;
        }
        return answer;
    }
}
