// Last updated: 8/6/2026, 10:27:33 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> number=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(number.contains(nums[i])){
                return true;
            }
            number.add(nums[i]);
           
        }
        return false;
    }
}