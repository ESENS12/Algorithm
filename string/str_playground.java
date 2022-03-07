/**
 *     대문자면 소문자로, 소문자는 대문자로 변환
 *     StuDY -> sTUdy
 * 
 * 
 */

public int solutionv3(String str){
    int result =0;
    StringBuilder stringBuilder = new StringBuilder(str);
    for(int i=0;i<str.length(); i++){
        String target = Character.toString(stringBuilder.charAt(i));
        if(target.matches("[a-z]")){
            stringBuilder.replace(i,i+1,target.toUpperCase(Locale.ROOT));
        }else{
            stringBuilder.replace(i,i+1,target.toLowerCase(Locale.ROOT));
        }
    }
    return result;
}

/***
 * 
 *   중복 문자 제거
 *   using Stream, StringBuffer
 * 
 */

public String solution(String str){
    int[] arr = str.chars().distinct().toArray();
    StringBuilder stringBuilder = new StringBuilder();
    for(int i : arr){
        stringBuilder.append((char)i);
    }
    
    return stringBuilder.toString();
}


/**
 *  팰린드롬인지 확인하기
 *  대소문자를 가리지 않는 문자열 str이 팰린드롬이면 YES, 아니면 NO를 리턴
 * 
 * gooG -> YES
 * googg -> NO
 * ggoogg -> YES
 * gggoogg -> NO
 * 
 *  */
public String solution(String str){
    String result = "YES";
    if(str.length() % 2 ==0){
        int idx = str.length()/2;
        for(int i=0; i<idx; i++){
            String first = Character.toString(str.charAt(i)).toLowerCase(Locale.ROOT);
            String last = Character.toString(str.charAt(str.length()-i-1)).toLowerCase(Locale.ROOT);
            if(!first.equals(last)){
                result = "NO";
                break;
            }
        }
    }else{
        result = "NO";
    }
    return result;
}

/***
 * 
 *  문자열에서 숫자만 추출하여 출력하기
 *  g0en2T0s8eSoft -> 208
 * 
 */
public String solutionv3(String str){
    String result = "";
    str = str.toLowerCase(Locale.ROOT);
    result = str.replaceAll("[a-z]*","");
    return Integer.parseInt(result)+"";
}


/**
 *      가장짧은 문자거리 구하기
 *      입력 teachermode , e 
 *      출력 10121012210
 *      각 문자열에서 target character와 가장 가까운 거리를 구해서 출력.
 * 
 * 
 *  */

public String solution(String str, String target){

    int[] ints_result = new int[str.length()];
    ArrayList<Integer> idxList = new ArrayList<>();
    StringBuilder results_builder = new StringBuilder();

    for(int i=0; i<str.length(); i++){
        ints_result[i] = 999;
        if(Character.toString(str.charAt(i)).equals(target)){
            idxList.add(i);
        }
    }

    for(int j=0; j<str.length(); j++){

        for(int targetIdx : idxList){
            int absInt = Math.abs(j-targetIdx);
            if(ints_result[j] > absInt){
                ints_result[j] = absInt;
            }
        }
    }
    
    for(int res : ints_result){
        results_builder.append(res);
    }
    
    return results_builder.toString();
}
