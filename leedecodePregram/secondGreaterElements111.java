package leedecodePregram;

import util.com.util;

import java.util.Stack;

public class secondGreaterElements111 {
    public static void main(String[] args) {
        int arr [] = {2,4,0,9,6};

        int[] temp=secondGreaterElement(arr);

        for (int i=0; i<temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
    public static int[] secondGreaterElement(int[] nums) {
        int n=nums.length;

        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.empty()&&nums[stack.peek()]<nums[i]){
                nums[stack.pop()]=nums[i];
            }
            stack.push(i);
        }

        while(!stack.empty()){
            nums[stack.pop()]=-1;
        }
        util.printArrays(nums);
        System.out.println();
        for(int i=0;i<n;i++){
            while(!stack.empty()&&nums[stack.peek()]<nums[i]){
                nums[stack.pop()]=nums[i];
            }
            stack.push(i);
        }

        while(!stack.empty()){
            nums[stack.pop()]=-1;
        }
        return nums;
    }
}
