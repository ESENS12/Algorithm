//문제출처(프로그래머스 데모) : https://programmers.co.kr/tryouts/3930/challenges?original_test_id=27911&original_token=6041a4adb34727a21f511d1e88c1d361#quiz-2016

class Solution {
    public int[] solution(int[][] v) {        
        int[] answer = new int[2];
        
        answer[0] = v[0][0]^ v[1][0]^ v[2][0];
        answer[1] = v[0][1]^ v[1][1]^ v[2][1];
 
        return answer;
    }
}
