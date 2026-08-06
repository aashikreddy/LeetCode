// Last updated: 8/6/2026, 10:26:59 AM
class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        int n = colors.length;
        for(int i=0;i<n;i++){
            if(colors[i] != colors[0]){
                max = Math.max(max,i);
            }
            if(colors[i] != colors[n-1]){
                max = Math.max(max,n-1-i);
            }
        }
        return max;
        }
    }