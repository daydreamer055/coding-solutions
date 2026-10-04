class Solution {
    public int minCost(int[] arr) {
        // code here
        if(arr == null || arr.length <=1 ){
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int sum =0;
        while(pq.size()>1){
            int a1 = pq.poll();
            int a2 = pq.poll();
            sum = sum + a1+a2;
            int s = a1+a2;
            pq.add(s);
        }
        return sum;
    }
}