// 문제출처 : https://programmers.co.kr/learn/courses/30/lessons/12977

class Solution {
    boolean[] visited = {};
    int answer = 0;

    public int solution(int[] nums) {
        visited = new boolean[nums.length];
        combination(nums,visited, 0, nums.length, 3); 
        return answer;
    }
    
    public void println(String str){
        System.out.println(str);
    }
    
    public boolean isPrime(int num){        
        for(int i=2; i<num; i++){
            if(num % i == 0){
                if(num != i){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            int num = 0;
            for(int i=0; i<arr.length; i++){
                boolean b = visited[i];
                if(b){
                    num += arr[i];
                }
                
            }
            
            if(isPrime(num)){
                answer +=1;
            }
            
            return;
        } 

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}
