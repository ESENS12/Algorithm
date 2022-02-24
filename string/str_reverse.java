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