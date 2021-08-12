//문제출처 : https://programmers.co.kr/learn/courses/30/lessons/42747
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int temp = 0;

        for(int i=0; i<citations.length; i++){
            for (int j=0; j<citations.length-i-1; j++){
                if(citations[j] < citations[j+1]){
                    temp = citations[j];
                    citations[j] = citations[j+1];
                    citations[j+1] = temp;
                }
            }
        }
        for(int i=0; i<citations.length; i++){
            if(citations[i] >= i){
                answer = i+1;
                if(answer > citations[i]){
                    answer = citations[i];
                }
            }
        }
        return answer;
    }
}