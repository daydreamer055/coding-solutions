
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int ans = 0;
            int count = Math.min(n, k + 1);

            for (int i = n - 1; i >= n - count; i--) {
                ans += arr[i];
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
