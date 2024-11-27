//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int x = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.search(nums, x));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    static int search(int arr[], int x) {
        // Iterate through the array to find the target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the element is not found
    }

    p {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;

        int result = search(arr, x);
        System.out.println("Index of " + x + ": " + result); // Output: Index of 3: 2
    }
}

 