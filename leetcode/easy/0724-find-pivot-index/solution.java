class Solution {
    public int pivotIndex(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        ans.add(nums[0]);
        for(int i=1;i<n;i++){
            int sum = nums[i]+ ans.get(i-1);
            ans.add(sum);
        }
        for(int i=0;i<n;i++){
            int leftsum = ans.get(i) - nums[i];
            int rightsum = ans.get(n-1) - ans.get(i);
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
}