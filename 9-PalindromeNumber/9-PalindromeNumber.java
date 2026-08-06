// Last updated: 8/6/2026, 10:27:45 AM
class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String result="";
        boolean s1=false;
        for(int i=s.length()-1;i>=0;i--){
            result=result+s.charAt(i);
        }
        if(result.equals(s)){
            s1=true;
        }
        return s1;   
    }
}