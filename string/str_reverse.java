// 특정 문자열(알파벳)만 뒤집기
public String solution(String str) {
    String answer = "";
    char[] chars = str.toCharArray();
    int lt=0, rt = str.length()-1;
    while(lt<rt){
        if(!Character.isAlphabetic(chars[lt])){
            lt++;
        }else if(!Character.isAlphabetic(chars[rt])){
            rt--;
        }else{
            char temp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = temp;

            lt++;
            rt--;
        }
    }
    answer = String.valueOf(chars);

    return answer;
}

// 전체 뒤집기 [Using O(1) Space ]
class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder(String.valueOf(s));
        sb.reverse();
        s = sb.toString().toCharArray();
    }
}

// 전체 뒤집기 (using two point)
class Solution {
    public void reverseString(char[] s) {
        int lt = 0;
        int rt = s.length-1;
        char temp = '0';
        while(lt<rt){
            temp = s[lt];
            s[lt] = s[rt];
            s[rt] = temp;
            lt++;
            rt--;
        }
    }
}

// 단어별로 뒤집기 ("God Ding" -> "doG gniD")
class Solution {
    public String reverseWords(String s) {
        StringBuilder sbResult = new StringBuilder();
        while(s.indexOf(" ") > -1){
            String target = s.substring(0, s.indexOf(" "));
            s = s.substring(s.indexOf(" ")+1);
            
            StringBuilder sb = new StringBuilder(String.valueOf(target));
            sb.reverse();
            sbResult.append(sb);
            sbResult.append(" ");
        }
        
        StringBuilder sb = new StringBuilder(String.valueOf(s));
        sb.reverse();
        sbResult.append(sb);
        
        return sbResult.toString();
    }   
}