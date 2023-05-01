package searching;

import util.com.util;

public class positionfind {
    public static void main(String[] args) {


        int[] nums = {1, 2, 2, 3, 3, 3, 5, 5, 5, 5, 5, 7};
        int target = 3;
        int arr[]=new int[2];
        arr[1]=searchInsert(nums,target);
        arr[0]=searchInsert1(nums,target);
        util.printArrays(arr);
    }
    public static int searchInsert(int[] nums, int target) {
        int l=0;
        int k=-1;
        int h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<=target){
                l=mid+1;
            }
            else {
                h=mid-1;
            }
            if(nums[mid]==target){
                k=mid;
            }

        }

        return k;


    }
    public static int searchInsert1(int[] nums, int target) {
        int l=0;
        int k=-1;
        int h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>=target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            if(nums[mid]==target){
                k=mid;

            }

        }
        return k;


    }
}
