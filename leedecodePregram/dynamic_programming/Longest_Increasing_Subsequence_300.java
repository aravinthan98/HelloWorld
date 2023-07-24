package leedecodePregram.dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Longest_Increasing_Subsequence_300 {
    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60};
//        int lisLength = findLIS(nums);
        int lisLength=lengthOfLIS(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + lisLength);
    }
        //===========1 method===================
        public static int findLIS(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            int n = nums.length;
            int[] dp = new int[n];
            Arrays.fill(dp, 1);

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }

            int maxLIS = 0;
            for (int length : dp) {
                maxLIS = Math.max(maxLIS, length);
            }

            return maxLIS;
        }
        //--------------------optimised method-------------------------
        public static int lengthOfLIS(int[] nums) {
            int n = nums.length;
            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);

            for (int i = 1; i < n; i++) {
                if (nums[i] > list.get(list.size() - 1)) {
                    list.add(nums[i]);
                } else {
                    int low = 0;
                    int high = list.size() - 1;
                    while (low <= high) {
                        int mid = (high + low) / 2;
                        if (list.get(mid) < nums[i]) {
                            low = mid + 1;
                        } else {
                            high = mid - 1;
                        }
                    }
                    list.set(low, nums[i]);
                }
            }
            return list.size();
        }

}
