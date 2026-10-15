class Solution {
    public static void utility(String s) {
        // code here
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(arr[i]);
                
            }
        }
    }
}