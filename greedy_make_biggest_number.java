// 문제출처 : https://programmers.co.kr/learn/courses/30/lessons/42883
// 큰 수 만들기 (단순 탐욕법인줄 알았으나 의외로 시간제한이 빡셈. 스택으로 푸는게 일반적인 모양)

class Solution {
    public String solution(String number, int k){
        StringBuilder answer = new StringBuilder();
        int nCnt = 0;
        char nChMaxNum = '0';

        for (int i = 0; i < number.length() - k; i++) {
            nChMaxNum = '0';
            for (int j = nCnt; j <= k + i; j++) {
                char nTargetChar = number.charAt(j);
                if(nTargetChar == '9'){
                    nChMaxNum = '9';
                    nCnt = j+1;
                    break;
                }
                if (number.charAt(j) > nChMaxNum) {
                    nChMaxNum = number.charAt(j);
                    nCnt = j + 1;
                }
            }
            answer.append(nChMaxNum);
        }
        return answer.toString();
    }
}