// Last updated: 8/6/2026, 10:27:24 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int AS=n*(n+1)/2;
        int ES=0;
        for(int i=0;i<nums.length;i++){
            ES+=nums[i];
        }
        return AS-ES;
        
    }
}