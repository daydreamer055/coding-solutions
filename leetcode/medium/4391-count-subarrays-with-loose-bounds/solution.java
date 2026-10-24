class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int[] vor = nums.clone();
        long count=0;
        long len=0;
        for(int num :vor){
            if(num >= minK && num<= maxK){
               len++;
                count+=len;
            }
            else{
                len=0;
            }
        }
        return count;
    }
}