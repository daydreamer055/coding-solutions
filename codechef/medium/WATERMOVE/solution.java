
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int i = 0; i < n; i++) {
                pq.add(sc.nextInt());
            }

            for (int i = 0; i < k; i++) {
                int a = pq.poll();
                int b = pq.poll();

                pq.add(a + b);
                pq.add(0);
            }

            int max = 0;

            for (int x : pq) {
                max = Math.max(max, x);
            }

            System.out.println(max);
        }

        sc.close();
    }
}
