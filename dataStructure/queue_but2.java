// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42584
// queue/stack 으로 분류된 문제였으나 큐, 스택으로도 O(n^2) 이상 효율을 낼수 없을것 같아 그냥 단순하게 구현
public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        //전체길이 - 자기보다 큰 값의 인덱스 - 자기 인덱스 = 하락하지 않은 시간
        for(int i = 0; i< prices.length; i++){
            int second = answer.length - i -1;
            int number = prices[i];
            for(int j=i; j<prices.length; j++){
                if(number > prices[j]){
                    second = j - i;
                    break;
                }
            }
            answer[i] = second;
        }
        return answer;
    }