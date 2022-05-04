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


// 문제 
// https://leetcode.com/problems/container-with-most-water/submissions/
// O(n*2) 풀이

class Solution {
    public int maxArea(int[] height) {
        if(height.length == 2){
            return Math.min(height[0],height[1]);
        }
        int nResult = 1;
    
        for(int i=0; i<height.length; i++){
            int ltDam = height[i];
            for(int j=i+1; j<height.length; j++){
                int rtDam = height[j];
                int nTemp = Math.min(ltDam,rtDam);
                nTemp = nTemp * (j-i);

                if(nResult < nTemp){
                    nResult = nTemp;
                }
            
            }
        }

        return nResult;
    }
}


---------------------------------------------------------------------------------
// O(n) 풀이

class Solution {
    public int maxArea(int[] height) {
        int lt = 0;
        int rt = height.length - 1;
	    int nMaxValue = 0;

	    while (lt < rt) {
		    nMaxValue = Math.max(nMaxValue, Math.min(height[lt], height[rt]) * (rt - lt));
            
            if (height[lt] < height[rt]){
                lt++;
            }else{
                rt--;
            }
	    }

	    return nMaxValue;
    }
}
