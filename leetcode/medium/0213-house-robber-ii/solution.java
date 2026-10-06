class Solution {
    public int money(int[] nums,int i ,int end, int[] dp  ){
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];
        int mx = nums[i] + money(nums,i+2,end,dp);
        int skip = money(nums,i+1,end,dp);
        dp[i] = Math.max(mx,skip);
        return dp[i];
    }
    public int fin(int[]nums,int start,int end){
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return money(nums,start,end,dp);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
       int first = fin(nums,0,n-2);
       int second = fin(nums,1,n-1);
       return Math.max(first,second);
        
    }
}