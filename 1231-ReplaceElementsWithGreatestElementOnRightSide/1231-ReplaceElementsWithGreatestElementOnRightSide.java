// Last updated: 8/6/2026, 10:27:08 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(max,arr[j]);
            }
            if(i != arr.length-1){
            int temp=max;
            max=arr[i];
            arr[i]=temp;
            }
        } 
        arr[arr.length-1] = -1;
    return arr;       
    }
}