import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    int k = sc.nextInt();
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int ans =0;
		    int j=0;
		    if(k>n){
		        for(int i=0;i<n;i++){
		            ans = ans+arr[i];
		        }
		    }
		     else{while(k-->0){
		      ans = ans + arr[j];
		    }
		    j++;
		     }
		    System.out.println(ans);
		}

	}
}
