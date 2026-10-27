class Solution {
    static int sum;
    public int ways(int i,int[] arr,int s,int target,int[][] dp){
        if(i== arr.length){
            if(s == target) return 1;
            else return 0;
        }
        if(dp[i][s+sum] != -1) return dp[i][s+sum];
    int add = ways(i+1,arr,s+arr[i],target,dp);
    int sub = ways(i+1,arr,s-arr[i],target,dp);
    return dp[i][s+sum] = add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
       sum=0;
       int n = nums.length; 
       for(int ele:nums) sum+=ele;
       int[][] dp = new int[n][2*sum+1];
       for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j] = -1;
        }
       }
       return ways(0,nums,0,target,dp);
    }
}