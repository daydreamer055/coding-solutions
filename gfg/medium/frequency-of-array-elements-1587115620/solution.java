class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=1;i<=n;i++){
            ans.add(map.getOrDefault(i,0));
        }
        return ans;
    }
}
