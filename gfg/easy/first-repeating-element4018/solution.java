class Solution {
    public int firstRepeated(int[] arr) {
        // code here
        int ans =Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                ans = Math.min(ans,map.get(arr[i]));
            }
            else{
                map.put(arr[i],i+1);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
