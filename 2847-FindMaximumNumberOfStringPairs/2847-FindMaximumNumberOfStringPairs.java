// Last updated: 8/6/2026, 10:26:44 AM
class Solution {
    public static String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        int n=words.length;
        for(int i=0;i<n-1;i++){
            String a=words[i];
            
            for(int j=i+1;j<n;j++)
            {
                String b=words[j];
                String revb=reverse(b);
                 if(a.equals("0")){
                    break;
                }
                if(a.equals(revb)){
                    ans++;
                    words[j]="0";
                }
            }
        }return ans;
    }
}