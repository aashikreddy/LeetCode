// Last updated: 8/6/2026, 10:26:42 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            String s=sentences[i];
            int temp=1;
            for(int j=0;j<sentences[i].length();j++){
            if(s.charAt(j)==' '){
                temp++;
                
            }
           
        }
       
      ans=Math.max(ans,temp);  
    }
    return ans;

}
}