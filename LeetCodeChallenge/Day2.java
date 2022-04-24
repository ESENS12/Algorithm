import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int target = Math.abs(nums[i]);
            nums[i] = target*target;
        }
        
        Arrays.sort(nums);
        return nums;
    }
}


class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

/**

1,2,3,4,5,6,7 , k=3 일 때, 
1. 배열 반전 -> 7,6,5,4,3,2,1
2. 첫 번째 K 요소를 반전 -> 5,6,7,4,3,2,1
3. 나머지 요소를 반전 -> 5,6,7,1,2,3,4

-1, -100, 3, 99 , k =2 일 때,
1. 배열 반전 -> 99, 3, -100, -1
2. 첫 번째 K 요소를 반전 -> 3, 99, -100, -1
3. 나머지 요소를 반전 -> 3, 99, -1, -100

반대로 하고자 한다면 음수일때 처리를 해주면 됨
K = K % nums.length;
if(K<0){
    K = K + nums.length;
}

**/
