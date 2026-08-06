// Last updated: 8/6/2026, 10:26:40 AM
class Solution {
    public static int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        int res;
        for(int i=0;i<n-1;i++){
            res=Math.abs(s.charAt(i)-s.charAt(i+1));
            sum+=res;


        }
        return sum;
    }
    public static void main(String a[]){
        int result = scoreOfString("Hello");
        System.out.println(result);
    };

}