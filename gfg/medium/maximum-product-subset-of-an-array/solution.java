class Solution {
    public int findMaxProduct(int[] arr) {
        // code here
        int n = arr.length;
        if(n==1) return arr[0];
        long ans =1;
        int mod = (int)1e9 +7;
        int zc=0,nc=0;
        int maxNeg = Integer.MIN_VALUE , idxMaxNeg = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zc++;
            }
            else if(arr[i]<0){
                nc++;
                if(idxMaxNeg == -1 || arr[i]>maxNeg){
                    maxNeg = arr[i];
                    idxMaxNeg = i;
                }
            }
        }
        if(zc == n) return 0;
        if(nc == 1 && zc== n-1) return 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) continue;
            if(nc%2 == 1 && i== idxMaxNeg) continue;
            ans = ((ans*arr[i])%mod + mod)%mod;
        }
        return (int)ans;
    }
}