package gcd.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class permutationInArray {
    public static List<List<Integer>> permute(int nums[])
    {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,nums,0);
        return result;
    }
    public static void backtrack(List<List<Integer>> result, int[] nums, int start)
    {
        if(start==nums.length)
        {
            result.add(toList(nums));
        }
        else
        {
            for(int i=start;i<nums.length;i++)
            {
                swap(i,start,nums);
                backtrack(result,nums,start+1);
                swap(i,start,nums);
            }
        }
    }
    public static List<Integer> toList(int[] nums)
    {
        List<Integer> res=new ArrayList<>();
        for(int i: nums)
            res.add(i);
        return res;
    }
    public static void swap(int i, int j, int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.print(permute(nums));


    }
}
