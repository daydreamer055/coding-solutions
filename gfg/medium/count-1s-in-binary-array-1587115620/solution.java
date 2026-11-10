class Solution {
    public int countOnes(int[] arr) {
        // code here
        int i=0;
        
        int j = arr.length-1;
        int count=0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==1){
                count+=1+mid-i;
                i= mid+1;
            }
            if(arr[mid]==0){
                j= mid-1;
            }
        }
        return count;
    }
}