/**
*     문제출처 : https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
*/

import java.lang.System;
import java.util.Arrays;
class Solution {
  // 그냥 버블정렬로 구현..
    public void sort(int[] array){
        // int[] sorted = Arrays.copyOf(array, array.length);
        int cache = 0;
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    cache = array[j+1];
                    array[j+1] = array[j];
                    array[j] = cache;
                }
            }
        }
        // return sorted;
    }
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i=0; i< commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int target = commands[i][2] - 1;
            
            int[] conquer = Arrays.copyOfRange(array, start, end+1);
            sort(conquer);
            answer[i] = conquer[target];
        }
        return answer;
    }
}
