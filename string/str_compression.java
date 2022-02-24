//반복되는 문자열 압축
public String solution(String str) {
    String answer = "";
    StringBuilder sb = new StringBuilder(answer);
    char current = str.charAt(0);
    int nIndex = 1;
    for(int i=1; i<str.length(); i++){
        if(current == str.charAt(i)){
            nIndex++;
        }else{
            if(nIndex>1){
                sb.append(nIndex);
            }
            sb.append(current);
            nIndex = 1;
            current = str.charAt(i);
        }
        if(i == str.length()-1){
            sb.append(str.charAt(i));
        }
    }
    answer = sb.toString();
    return answer;
}