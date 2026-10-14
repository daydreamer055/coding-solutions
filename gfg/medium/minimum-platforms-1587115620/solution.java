class Solution {
    class pair implements Comparable<pair>{
        int arr;
        int dep;
        pair(int arr,int dep){
            this.arr = arr;
            this.dep = dep;
        }
        public int compareTo(pair p){
            if(this.arr == p.arr) return this.dep - p.dep;
            return this.arr - p.arr;
        }
    }
    public int minPlatform(int arr[], int dep[]) {
        //  code here
         ArrayList<pair> list = new ArrayList<>();
         int n = arr.length;
         for(int i=0;i<n;i++){
             list.add(new pair(arr[i],dep[i]));
         }
         
          Collections.sort(list);
          PriorityQueue<Integer> pq = new PriorityQueue<>();
          int max =0;
          for(pair p: list){
              while(!pq.isEmpty() && pq.peek() < p.arr){
                  pq.poll();
              }
              pq.add(p.dep);
              max = Math.max(max,pq.size());
          }
          return max;
    }
}
