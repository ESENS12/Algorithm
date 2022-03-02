// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12945
// 팩토리얼, bottom-up 방식 (입력값 n의 수가 큰 경우)

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = factorial(n);
        return answer;
    }
    
    public int factorial(int n){

        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        if(n == 0) return arr[0];
        else if(n == 1) return arr[1];
        else {
            for (int i = 2; i < n+1; i++) {
                arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
            }
            return arr[n];
        }
    }
}