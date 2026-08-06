// Last updated: 8/6/2026, 10:27:02 AM
class Solution {
   public static int finalValueAfterOperations(String[] operations) {
                    int num=operations.length;
                    int result=0;
                    for(int i=0;i<num;i++){
                        if(operations[i].equals("--X")||operations[i].equals("X--"))
                        {
                            result--;
                        }
                        if(operations[i].equals("++X")||operations[i].equals("X++"))
                        {
                            result++;
                        }
            
                    }
                    return result;
                    
                }
                public static void main(String a[]){
                    String [] operations={"--X","X++","X++"};
                    int res = finalValueAfterOperations(operations);
                    System.out.println(res); 
                }
}