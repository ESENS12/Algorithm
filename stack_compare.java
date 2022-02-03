// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/76502 
// 괄호 짝 찾기

import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean bIsCorrect = PairCheck(s);
            if(bIsCorrect){
                answer+=1;
            }
            s = s.substring(1, s.length()) + s.substring(0, 1);
        }
        return answer;
    }

    public boolean PairCheck(String str) {
        String str_opens = "({[";
        Stack<Character> open_stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str_opens.indexOf(str.charAt(i)) > -1 ) {
                open_stack.push(str.charAt(i));
            } else {
                if (!open_stack.isEmpty()) {
                    char open_char = open_stack.pop();
                    char target_char = str.charAt(i);
                    if (open_char == '(' && target_char == ')') {
                        continue;
                    } else if (open_char == '{' && target_char == '}') {
                        continue;
                    } else if (open_char == '[' && target_char == ']') {
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (open_stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}