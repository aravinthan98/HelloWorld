package leedecodePregram;

import java.util.ArrayList;
import java.util.List;

//You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
//
//The 2D array should contain only the elements of the array nums.
//Each row in the 2D array contains distinct integers.
//The number of rows in the 2D array should be minimal.
//Return the resulting array. If there are multiple answers, return any of them.
//
//Note that the 2D array can have a different number of elements on each row.
//
//
//
//Example 1:
//
//Input: nums = [1,3,4,1,2,3,1]
//Output: [[1,3,4,2],[1,3],[1]]
//Explanation: We can create a 2D array that contains the following rows:
//- 1,3,4,2
//- 1,3
//- 1
public class Convert_an_Array_Into_a_2D_Array_With_Conditions_2610 {
    public static void main(String[] args) {
        int[] nums={1,3,4,1,2,3,1};
        System.out.print(findMatrix(nums));
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();

        List<List<Integer>> parentlists = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        while(!list.isEmpty()){
            ArrayList<Integer>list1=new ArrayList<>();
            int i=0;
            while(i<list.size()){
                if(!list1.contains(list.get(i))){
                    list1.add(list.get(i));
                    list.remove(i);
                }
                else{
                    i++;
                }
            }
            parentlists.add(list1);
        }

        return parentlists;
    }
}
