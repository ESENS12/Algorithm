import java.util.HashMap;

 public int solution(int nNumber, String str){
    int result = 0;
    char[] chars = str.toCharArray();

    HashMap<Character, Integer> hm = new HashMap<>();
    for(int i=0; i<nNumber; i++){
        hm.put(chars[i], hm.getOrDefault(chars[i], 0) + 1);
    }
    int maxNumber = 0;
    char target = ' ';
    for(char x : hm.keySet()){

        if(hm.get(x) > maxNumber){
            target = x;
            maxNumber = hm.get(x);
        }
    }
    Log.e(TAG,"target : " + target);
    return result;
}


public int solution(String str1, String str2){
    int result = 0;
    HashMap<Character, Integer> hm1 = new HashMap<>();
    for(char c : str1.toCharArray()){
        hm1.put(c,hm1.getOrDefault(c,0)+1);
    }
    String res = "TRUE";
    for(char c : str2.toCharArray()){
        if(!hm1.containsKey(c) || hm1.get(c) == 0){
            res = "FALSE";
        }else{
            hm1.put(c,hm1.get(c)-1);
        }
    }
    Log.e(TAG,"result : " + res);
    return result;
}


public int solution(String str1, String str2){
    //7 4
    //20 12 20 10 23 17 10

    int nSize = 7;
    int nRange = 4;
    int[] arr = new int[]{20,12,20,10,23,17,10};
    ArrayList<Integer> answer = new ArrayList<>();
    int result = 0;
    HashMap<Integer, Integer> hm1 = new HashMap<>();
    for(int i=0; i<nRange-1; i++){
        hm1.put(arr[i], hm1.getOrDefault(arr[i],0) + 1);
    }
    
    //two-point sliding window
    int lt=0;
    for(int rt = nRange-1; rt<nSize; rt++){
        hm1.put(arr[rt], hm1.getOrDefault(arr[rt],0)+1);
        answer.add(hm1.size());
        hm1.put(arr[lt], hm1.get(arr[lt])-1);
        if(hm1.get(arr[lt]) == 0) {
            hm1.remove(arr[lt]);
        }
        lt++;
    }

    Log.e(TAG,"result : " + result);
    return result;
}

public int solution(String str1, String str2){
    // bacaAacba
    // abc
    String str = "bacaAacba";
    String target = "abc";
    // str에서 연속된 문자열중 target의 아나그램인 조합의 개수

    ArrayList<Integer> answer = new ArrayList<>();

    int result = 0;
    HashMap<Character, Integer> hm = new HashMap<>();
    for(char c : target.toCharArray()){
        hm.put(c, hm.getOrDefault(c,0)+1);
    }
    StringBuilder temp = new StringBuilder();
    // target length -1 개까지는 미리 temp에 넣어둔다
    for(int i=0; i<target.length()-1; i++){
        temp.append(str.charAt(i));
    }
    int lt = temp.length();
    char[] chars = str.toCharArray();
    ArrayList<String> subStringList = new ArrayList<>();

    for(int rt=temp.length(); rt<str.length(); rt++){
        temp.append(str.charAt(rt));
//            Log.e(TAG,"temp : " + temp.toString());
        subStringList.add(temp.toString());
        temp.delete(0,1);
        lt++;
    }

    for(String strs : subStringList){
        char[] charsTemp = strs.toCharArray();
        HashMap<Character,Integer> hmTemp = new HashMap<>();
        hmTemp = (HashMap<Character, Integer>) hm.clone();
        boolean bIsAnagram = true;
        for(char c : charsTemp){
            if(!hmTemp.containsKey(c) || hmTemp.get(c) == 0){
                bIsAnagram = false;
                break;
            }else{
                hmTemp.put(c,hm.get(c)-1);
            }
        }
        if(bIsAnagram){
            result++;
            Log.e(TAG,"anagram : " + strs);
        }
    }

    Log.e(TAG,"result : " + result);
    return result;
}


