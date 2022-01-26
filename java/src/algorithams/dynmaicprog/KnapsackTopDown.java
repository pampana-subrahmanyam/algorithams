package algorithams.dynmaicprog;

import java.util.Arrays;

public class KnapsackTopDown {
	 // Declare the table dynamically
	static int val[] = { 60, 100, 120 };   
    static int wt[] = { 10, 20, 30 };  
    static int W = 50;  
    static int N = val.length; 
    static int dp[][] = new int[N + 1][W + 1]; 
    
    static int max(int a, int b) 
    { 
      return (a > b) ? a : b; 
    }
 
 // Returns the value of maximum profit   
    static int knapSackRec(int W, int wt[], 
                           int val[], int n,
                           int [][]dp)
    {   
         
        // Base condition
        if (n == 0 || W == 0)   
            return 0;
             
        if (dp[n][W] != -1)
            return dp[n][W];   
         
        if (wt[n - 1] > W)   
         
            // Store the value of function call   
            // stack in table before return
            return dp[n][W] = knapSackRec(W, wt, val, 
                                          n - 1, dp);
                                           
        else
         
            // Return value of table after storing  
            return dp[n][W] = max((val[n - 1] + 
                                  knapSackRec(W - wt[n - 1], wt,
                                              val, n - 1, dp)),
                                  knapSackRec(W, wt, val, 
                                              n - 1, dp));             
    }
     
    static int knapSack(int W, int wt[], int val[], int N)
    {  
         
    	
         
        // Loop to initially filled the 
        // table with -1 
        for(int i = 0; i < N + 1; i++)   
            for(int j = 0; j < W + 1; j++)   
                dp[i][j] = -1;    
         
        return knapSackRec(W, wt, val, N, dp);     
    }
     
    // Driver Code 
    public static void main(String [] args)
    {       
        System.out.println("Result is " +knapSack(W, wt, val, N)); 
        System.out.println("Result  Array is = "); 
        
        System.out.println("Storage Array = ");
        for(int[] row : dp) {
            printRow(row);
        }

    } 
    
    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    }
