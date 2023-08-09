package leedecodePregram;

import java.util.Arrays;

public class Minimize_the_Maximum_Difference_of_Pairs_2616 {
    public static void main(String[] args) {
        int[] num={3,4,2,3,2,1,2};
        int p=3;
        System.out.print(minimizeMax(num,p));
    }
    public static int minimizeMax(int[] nums, int p){
        int n = nums.length;
        Arrays.sort(nums);
        int start=0, end=nums[n-1]-nums[0];
        int ans =0;
        while(start<=end){
            int mid = start+(end-start)/2;
            int count = 0;
            for(int i =1; i<n; i++){
                if(nums[i]-nums[i-1]<=mid){
                    count ++;
                    i++;
                    if(count>=p) break;
                }
            }
            if(count>=p){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}
