class Solution {

    int maxValue(int arr[]) {
        // Complete the function
        int n = arr.length;
        Arrays.sort(arr);
        int mod = (int)1e9 +7;
        long ans = 0;
        for(int i=0;i<n;i++){
            ans = (ans + (long)arr[i]*i)%mod;
        }
        return (int)ans;
    }
}
