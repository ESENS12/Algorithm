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
