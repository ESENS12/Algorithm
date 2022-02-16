// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/43165
// 깊이/너비 완전탐색, 조합으로 풀었을때, 테케 1,2번의 경우 80초.. 정도 걸리는 케이스가 있음 

class Solution {
    boolean[] visited;
    int temp_result = 0;
    int targetNumber = 0;
    int result = 0;

    public int solution(int[] numbers, int target) {
        
        visited = new boolean[numbers.length];
        targetNumber = target;
        for(int i=numbers.length; i>=0; i--){
            combination(numbers,visited,0,numbers.length,i);
        }
        return result;
    }
    void checkNumber(int[] arr, boolean[] visited){
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                temp_result += arr[i];
            }else{
                temp_result -= arr[i];
            }
        }
        if(temp_result == targetNumber){
            result +=1;
        }
        temp_result = 0;
    }

    void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            checkNumber(arr,visited);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}


// ================ DP로 푸는 경우 5초 내외..

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }
}
