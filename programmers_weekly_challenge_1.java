// 문제출처 : https://programmers.co.kr/learn/courses/30/lessons/82612

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long need_price = price;
        long remain_money = money;
        
        for (int i=1; i<count+1; i++){
            need_price = price * i;
            remain_money = remain_money - need_price;
        }
        if(remain_money > 0){
            return 0;
        }
        answer = Math.abs(remain_money);

        return answer;
    }
}
