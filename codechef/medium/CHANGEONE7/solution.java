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
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    if(n<=2){
		        System.out.println(0);
		        continue;
		    }
		    Arrays.sort(arr);
		    int ans =Math.min(arr[n-1]-arr[1],arr[n-2]-arr[0]);
		    System.out.println(ans);
		    
		}

	}
}
