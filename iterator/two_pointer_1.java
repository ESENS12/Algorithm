// 문제출처 https://leetcode.com/problems/two-sum/submissions/
//음수처리 아직 안됨. 

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = {0,0};
        
        int lt = 0;
        int rt = nums.length-1;
        int temp = 0;
        while(lt<=rt){
            
            temp = nums[lt] + nums[rt];
            if (temp == target) {
                results[0] = lt;
                results[1] = rt;
                break;
            }
            if (target < nums[rt]) {
                rt--;
            }else if(temp > target){
                rt--;
            }else{
                lt++;
            }
        }
        return results;
    }
    public void println(String str){
        System.out.println(str);
    }
}