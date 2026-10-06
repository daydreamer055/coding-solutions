class Solution {
    public int findMinDiff(int arr[], int m) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        if(m ==0 || n==0 ) return 0;
        if(m>n) return -1;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff = arr[i+m-1] - arr[i];
            ans = Math.min(diff,ans);
        }
        return ans;
        
    }
}