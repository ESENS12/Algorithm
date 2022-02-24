// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42862

import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    int[] arr = {};
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        ArrayList<Integer> candidate = new ArrayList<>();
        ArrayList<String> losts = new ArrayList<>();
        ArrayList<String> reserves = new ArrayList<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        
        for(int i=1;i<=n; i++){
            candidate.add(i);
        }
        
        for(int item : lost){
            losts.add(Integer.toString(item));
        }
        
        for(int item : reserve){
            reserves.add(Integer.toString(item));
        }
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    if(reserves.remove(Integer.toString(reserve[j]))){
                        losts.remove(Integer.toString(lost[i]));
                    }
                }
            }
        }

        lost = new int[losts.size()];
        for (int i=0; i < losts.size(); i++)
        {
            lost[i] = Integer.parseInt(losts.get(i));
        }

        reserve = new int[reserves.size()];
        for (int i=0; i < reserves.size(); i++)
        {
            reserve[i] = Integer.parseInt(reserves.get(i));
        }

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]-1 ||
                        lost[i]-1 == reserve[j]){
                    if(reserves.remove(Integer.toString(reserve[j]))){
                        losts.remove(Integer.toString(lost[i]));
                        break;
                    }
                }
                if(lost[i] == reserve[j]+1 ||
                        lost[i]+1 == reserve[j]){
                    if(reserves.remove(Integer.toString(reserve[j]))){
                        losts.remove(Integer.toString(lost[i]));
                        break;
                    }
                }
            }
        }
        // println("가능한 학생 수 : "+(candidate.size()-losts.size()));
        answer = candidate.size()-losts.size();
        return answer;
    }
    
    public void println(String str){
        System.out.println(str);
    }
}