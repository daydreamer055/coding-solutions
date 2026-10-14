class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;
        if(n==1) return true;
        int next = 0;
        for(int i=0;i<n;i++){
         next = i+nums[i];
        if(nums[i]==0 && i!= n-1) return false;

        }
        return true;
    }
}