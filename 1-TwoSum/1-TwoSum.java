// Last updated: 8/6/2026, 10:27:47 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int a[];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[j]==target-nums[i]){
               return new int[] {i,j};
            }
            }
        }
     return new int[nums.length];   
    }
}   
    
    