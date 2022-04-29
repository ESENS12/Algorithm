class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int nMaxLength = 0;
        
        for (int i=0, j=0; i<s.length(); ++i){
            if (hm.containsKey(s.charAt(i))){
                j = Math.max(j, hm.get(s.charAt(i))+1);
            }
            hm.put(s.charAt(i),i);
            nMaxLength = Math.max(nMaxLength,i-j+1);
        }
        return nMaxLength;
    }
    
}


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        
        if (len1 > len2) return false;
        
        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) return true;
        
        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count)) return true;
        }
        
        return false;
    }
    
    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }
}