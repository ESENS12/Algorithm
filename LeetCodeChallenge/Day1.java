class Solution {
    public int search(int[] nums, int target) {
        int lt = 0;
        int rt = nums.length -1;
        int result = -1;
        
        while(lt<=rt){
            
            if(target == nums[lt]){
                result = lt;
                break;
            }else{
                lt++;
            }
            if(target == nums[rt]){
                result = rt;
                break;
            }else{
                rt--;
            }
        }
        return result;
    }
}


public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lt = 1;
        int rt = n;

        while (lt < rt) {

          final int middle = lt + (rt - lt) / 2;
        
          if (isBadVersion(middle)){
            rt = middle;  
          }else{
              
            lt = middle + 1;  
          }
        }
        return lt;
    }
}



class Solution {
    public int searchInsert(int[] nums, int target) {
        int lt = 0;
        int rt = nums.length-1;
        
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                lt = mid + 1;
            else if(nums[mid] > target)
                rt = mid - 1;
        }
        return lt;
    }
}
