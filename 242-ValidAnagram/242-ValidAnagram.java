// Last updated: 8/6/2026, 10:27:23 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i:count){
            if(i!=0) return false;
        }
        return true;        
    }
}