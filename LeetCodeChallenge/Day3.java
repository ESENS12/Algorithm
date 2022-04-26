
class Solution {
    public void moveZeroes(int[] nums) {
        int idx_last_non_zero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[idx_last_non_zero] = nums[i];
                idx_last_non_zero += 1;
            }
        }
        for(int index = idx_last_non_zero; index < nums.length; index++){
            nums[index] = 0;
        }

    }
}




class Solution {
    public int[] twoSum(int[] numbers, int target) {
        temp = numbers[lt] + numbers[rt];
        if (temp == target) {
            results[0] = lt+1;
            results[1] = rt+1;
            break;
        }
        if (target < numbers[rt]) {
            rt--;
        }else if(temp > target){
            rt--;
        }else{
            lt++;
        }

    }
}
