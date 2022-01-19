// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/60057
// 문제 분류 : 문자열 

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        int len = s.length();

        if(s.length() <= 1){
            return 1;
        }

        for(int i=1; i<=len/2; i++) {
            String pattern  = s.substring(0,i);
            int cnt =1;
            String reStr="";
            
            for(int j=i; j<=s.length()-i; j+=i){
                String str_remain = s.substring(j,j+i);
                if(pattern.equals(str_remain)){
                    cnt++;
                }else {
                    if(cnt>1) {
                        reStr += cnt+"";
                    }
                    reStr += pattern;
                    pattern = str_remain;
                    cnt = 1;
                }
            }

            if(cnt > 1) {
                reStr+= ""+cnt;
            }
            reStr+= pattern;

            int div = s.length()%i;
            answer = Math.min(answer, reStr.length()+div);
        }
        return answer;
    }
}