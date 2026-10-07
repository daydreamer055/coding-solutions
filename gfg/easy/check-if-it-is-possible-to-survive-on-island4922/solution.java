class Solution {
    public int minimumDays(int S, int N, int M) {
        // code here
        if(((N*6)< (M*7) && S>6 ) || M>N) return -1;
        else {
            int days = (M*S)/N;
            if((M*S)%N !=0) days++;
         return days;
        }
       
    }
}