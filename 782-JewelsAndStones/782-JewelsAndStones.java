// Last updated: 8/6/2026, 10:27:18 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int i=0;i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    ans++;
                }

            }
        }
        return ans;
        
    }
}