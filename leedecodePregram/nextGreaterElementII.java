package leedecodePregram;

import java.util.Stack;
//Given a circular integer array nums (i.e., the next element of nums[nums.length - 1]
// is nums[0]), return the next greater number for every element in nums.
//
//The next greater number of a number x is the first greater number to its traversing-order
// next in the array, which means you could search circularly to find its next greater number.
// If it doesn't exist, return -1 for this number.

public class nextGreaterElementII {
    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1};

        int[] temp=nextGreaterElements(arr);

        for (int i=0; i<temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<2*n;i++){
            while(!stack.empty()&&nums[stack.peek()]<nums[i%n]){
                arr[stack.pop()]=nums[i%n];

            }
            if(i<n){
                stack.push(i);
            }
        }
        while(!stack.empty()){
            arr[stack.pop()]=-1;
        }
        return arr;
    }
}
