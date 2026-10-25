class Solution {
    public int profit(int i, int[]wt,int[] val,int c,int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][c]!= -1) return dp[i][c];
        int skip = profit(i+1,wt,val,c,dp);
        if(wt[i]>c) return dp[i][c] = skip;
        int pick = val[i] +profit(i+1,wt,val,c-wt[i],dp);
        return dp[i][c] = Math.max(skip,pick);
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = wt.length;
        int[][] dp = new int[n][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]= -1;
            }
        }
        return profit(0,wt,val,W,dp);
    }
}
