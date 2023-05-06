package leedecodePregram;

import java.util.Arrays;

public class NumberofSubsequencesThatSatisfytheGivenSumCondition1498 {
    public static void main(String[] args) {
        int[] arr={3,5,6,7};
        int target=9;
        System.out.println(numSubseq(arr,target));
    }
    public static int numSubseq(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=0;
        int left=0;
        int right=n-1;
        int  mod = (int)1e9 + 7;
        int[] pows = new int[n];
        pows[0] = 1;
        for (int i = 1 ; i < n ; ++i){
            pows[i] = pows[i - 1] * 2 % mod;
        }
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                res=(res+pows[right-left])%mod;
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
