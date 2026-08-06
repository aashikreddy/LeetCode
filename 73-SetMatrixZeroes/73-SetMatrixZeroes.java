// Last updated: 8/6/2026, 10:27:36 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> ZeroRows=new HashSet<>();
        Set<Integer> ZeroColumns=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    ZeroRows.add(i);
                    ZeroColumns.add(j);
                }   
            }
        }
        for(int i:ZeroRows){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
        for(int j:ZeroColumns){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=0;
            }
        }
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            List<Integer> sl=new ArrayList<>();
            for(int j=0;j<matrix[0].length;j++){
                sl.add(matrix[i][j]);
            }
            l.add(sl);
        }
        System.out.print(l);
        
    }
}