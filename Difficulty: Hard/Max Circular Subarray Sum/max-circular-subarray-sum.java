//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
         int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int curr=0,currneg=0;
        int s=0;
        for(int i:arr)
        {
            s+=i;
            curr+=i;
            maxSum= Math.max(curr,maxSum);
            if(curr<0)
            {
                curr=0;
            }
            currneg+=i;
            minSum=Math.min(currneg,minSum);
            if(currneg>0)
            {
                currneg=0;
            }
        }
        if(s==minSum)
        {
            return maxSum;
        }
        return Math.max(maxSum,s-minSum);
    }
}
