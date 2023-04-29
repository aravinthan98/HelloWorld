package leedecodePregram;

import util.com.util;

import java.util.Arrays;
import java.util.HashMap;

public class HowManyNumbersAreSmallerThantheCurrentNumber1365 {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        nums=smallerNumbersThanCurrent(nums);
        util.printArrays(nums);
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            }
        }
        System.out.print(map);
        for(int i=0;i<nums.length;i++){
            nums[i]=map.get(nums[i]);
        }

        return nums;

    }
}
