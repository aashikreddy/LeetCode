// Last updated: 8/6/2026, 10:26:41 AM
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        boolean result=true;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!(grid[i][i]!=0 && grid[i][grid.length-i-1]!=0)){
                    result=false;
                }
                if(i!=j && i+j!=grid.length-1){
                    if(grid[i][j]!=0){
                        result=false;
                    }
                }

            }
        }
        return result;
        
    }
}