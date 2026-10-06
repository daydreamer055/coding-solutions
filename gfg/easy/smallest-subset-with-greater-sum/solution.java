class Solution {
    int minSubset(int[] arr) {
        // code here
        int n = arr.length;
        int totalsum =0;
        for(int i=0;i<n;i++){
            totalsum+= arr[i];
        }
        Arrays.sort(arr);
        int i=0; 
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
       int sum =0;
       for(int k=0;k<n;k++){
           sum = sum + arr[k];
           totalsum = totalsum - arr[k];
           if(sum > totalsum){
               return k+1;
           }
       }
       return n;
    }
}