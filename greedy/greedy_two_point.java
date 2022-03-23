// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42885

import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int result = 0;

        Arrays.sort(people);
        int lt = 0;
        int rt=people.length-1;
        while(lt<=rt) {
            int sum = people[lt]+people[rt];
            if(sum <= limit){
                lt++;
            }
            rt--;
            result++;
        }

        return result;
    }
}
