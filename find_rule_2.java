문제출처 : https://programmers.co.kr/learn/courses/30/lessons/12922

// 내가 작성한 코드
class Solution {
    public String solution(int n) {
        String answer = "";
        String odd_char = "수";
        String even_char = "박";
        for(int i=0; i<n; i++){
            if(i%2 ==0){
                answer += odd_char;
            }else{
                answer += even_char;
            }
        }
        return answer;
    }
}

// n의 숫자만큼 char arr를 생성 후 substring 하는 방법
// return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);

