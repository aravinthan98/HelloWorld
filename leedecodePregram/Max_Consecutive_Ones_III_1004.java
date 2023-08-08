package leedecodePregram;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Max_Consecutive_Ones_III_1004 {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        System.out.print(longestOnes(arr,k));
    }
    public static int longestOnes(int[] nums, int k) {
        int itr=0;
        int count=0,max=0;
        int[] arr=new int[nums.length+1];
        arr[0]=-1;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                arr[++j]=i;
                count++;
            }
            if(count>k&&nums[i]==0) {
                itr++;
            }

            max = Math.max(max, (i -((arr[itr])+1)) + 1);
        }
        return max;
    }
}
