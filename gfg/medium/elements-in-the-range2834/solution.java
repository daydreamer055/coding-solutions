class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet();
        for(var v:arr){
            set.add(v);
        }
        for(int i= start;i<=end ; i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}