package Dynamic_programming;

public class Subset_target_sum {

        public static boolean isSubsetSum(int[] arr, int sum) {
            int n = arr.length;
            boolean[][] dp = new boolean[n + 1][sum + 1];

            // If sum is 0, an empty subset is always possible
            for (int i = 0; i <= n; i++) {
                dp[i][0] = true;
            }

            // If array is empty, no subset is possible except for sum 0
            for (int i = 1; i <= sum; i++) {
                dp[0][i] = false;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (arr[i - 1] <= j) {
                        dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            return dp[n][sum];
        }

        public static void main(String[] args) {
            int[] arr = {3, 34, 4, 5, 2};
            int sum = 9;
//            boolean subsetExists = isSubsetSum(arr, sum);
            boolean subsetExists = subsetSum(arr,0, sum);
            System.out.println(subsetExists);

        }
        public static boolean subsetSum(int[] arr,int sum,int n){
            if(sum==0){
                return true;
            }
            if(n==0){
                return false;
            }
            if (arr[n - 1] <= sum) {
                // Include the current element and check for remaining sum
                return subsetSum(arr, sum - arr[n - 1], n - 1) ||
                        // Exclude the current element and check for remaining sum
                        subsetSum(arr, sum, n - 1);
            } else {
                // Exclude the current element and check for remaining sum
                return subsetSum(arr, sum, n - 1);
            }
        }
}
