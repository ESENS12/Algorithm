// 문제출처 : https://programmers.co.kr/learn/courses/30/lessons/81301

class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] regrex = new String[]{
            "zero","one","two","three","four","five","six","seven","eight","nine"
        };
        for(int i=0; i<regrex.length; i++){
            if(s.contains(regrex[i])){
               s = s.replaceAll(regrex[i],i+"");
            }
        }
        answer = Integer.parseInt(s);
        
        return answer;
    }
}