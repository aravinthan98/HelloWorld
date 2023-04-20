package arrays;

import java.util.Arrays;

public class sum2closestX {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 10};
        int n = arr.length;

        int x = 15;
        int[] temp=twoSumClosest(arr, x);
//        int p1=0;
//        int p2=0;
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//               int sum=arr[i]+arr[j];
//               if(Math.abs(sum-x)<min){
//                   p1=i;
//                   p2=j;
//                   min=Math.abs(sum-x);
//
//               }
//            }
//        }
//        System.out.print(arr[p1]+" "+arr[p2]);
        //O(n^2)
        for(int i=0;i< temp.length;i++) {
            System.out.print(temp[i] + " ");
        }
    }

        public static int[] twoSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int[] result = new int[2];
            int minDiff = Integer.MAX_VALUE;
            for (int lo = 0, hi = nums.length - 1; lo < hi; ) {
                int sum = nums[lo] + nums[hi];
                int diff = Math.abs(target - sum);
                if (diff < minDiff) {
                    minDiff = diff;
                    result[0] = nums[lo];
                    result[1] = nums[hi];
                }
                if (sum < target) {
                    lo++;
                } else if (sum > target) {
                    hi--;
                } else {
                    break;
                }
            }
            return result;
        }



}
