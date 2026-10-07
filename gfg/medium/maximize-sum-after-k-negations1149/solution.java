class Solution {
    public int maximizeSum(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int i=0;
       while(k>0 && i<n && arr[i]<0 ){
           
          arr[i] = arr[i]* -1;
           
           i++;
           k--;
       }
       Arrays.sort(arr);
       while(k>0){
           arr[0] = -arr[0];
           k--;
       }
       long ans =0;
       for(int j=0;j<n;j++){
           ans = ans + arr[j];
       }
       return (int)ans;
    }
}