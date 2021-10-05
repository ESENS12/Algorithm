import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> items = new ArrayList<>();
        for(int i = 1; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                items.add(arr[i]);
            }
        }
        if(items.size() == 0){
            return new int[]{-1};
        }
        answer = new int[items.size()];
        Collections.sort(items);
        int index=0;
        for(int i : items){
            answer[index++] = i;
        }
        return answer;
    }
    public void println(String str){
        System.out.println(str);
    }
}