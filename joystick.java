// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42860
// 탐욕법이나 Math 함수 활용해서 해결

class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        int nextIdx; // 다음 값들을 확인할 때 사용
        int move = length - 1; // 좌우 움직임 수를 체크

        for(int i = 0; i < name.length(); i++){
            //A에서 가까운지, Z에서 가까운지 판단
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            nextIdx = i + 1;
            // A라면 스킵
            while(nextIdx < length && name.charAt(nextIdx) == 'A'){
                nextIdx++;
            }

            // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i * 2 + length - nextIdx);
            move = Math.min(move, (length - nextIdx) * 2 + i);
        }
        return answer + move;
    }
    public void println(String str){
        System.out.println(str);
    }
}