package Dynamic_programming;
//Input:
//4
//10 40 30 50
//5 2 6 3
//5
//
//Output:
//90
//
//Example:
//In this example, there are 4 items and the maximum weight capacity of the knapsack is 5.
//For w0 = 5, value=10
//For w1 + w3 = 5, value=90
//Maximum Value = 90
public class Knapsack {
    public static void main(String[] args) {
        int[] v={10,40,30, 50};
        int[] w={5,2,6,3};
        int W=5;
        System.out.println(maxWeight(w,v,W));
        System.out.println(knapSack(W,w,v));
    }
    //---------o(m*n) and sp O(m*n)-----------
    public static int maxWeight(int w[], int v[], int W) {
        int n = v.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (w[i - 1] <= j) {
                    dp[i][j] = Math.max(v[i - 1] + dp[i - 1][j - w[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];

    }
    static int knapSackRec(int W, int wt[], int val[],int n, int[][] dp) {

        // Base condition
        if (n == 0 || W == 0)
            return 0;

        if (dp[n][W] != -1)
            return dp[n][W];

        if (wt[n - 1] > W)

            // Store the value of function call
            // stack in table before return
            return dp[n][W]
                    = knapSackRec(W, wt, val, n - 1, dp);

        else

            // Return value of table after storing
            return dp[n][W]
                    = Math.max((val[n - 1]
                            + knapSackRec(W - wt[n - 1], wt, val,
                            n - 1, dp)),
                    knapSackRec(W, wt, val, n - 1, dp));
    }

    static int knapSack(int W, int wt[], int val[]) {

        // Declare the table dynamically
        int n=wt.length;
        int dp[][] = new int[n + 1][W + 1];

        // Loop to initially filled the
        // table with -1
        for (int i = 0; i < n + 1; i++)
            for (int j = 0; j < W + 1; j++)
                dp[i][j] = -1;

        return knapSackRec(W, wt, val, n, dp);
    }

}
